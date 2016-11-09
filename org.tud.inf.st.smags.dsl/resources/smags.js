var smags = (function(){
	var componentTypes = {};
	var portTypes = {};
	var roleModels = {};
	
	var PortType = function(portTypeName){
		this.portTypeName = portTypeName;
	};
	
	PortType.prototype.activate = function(){
		//empty
	};
	
	PortType.prototype.deactivate = function(){
		//empty
	};
					
	var ComponentType = function(componentTypeName){
		this.name = componentTypeName;
		this.requirements = new Array();
		this.offerings = new Array();
	};	

	ComponentType.prototype.requires = function(portType){
		this.requirements.push(portType);
	};
					
	ComponentType.prototype.offers = function(portType) {
		offerings.push(portTypes);
	};
	
	var ComponentInstance = function(name,type){
		this.name = name;
		this.type = type;
	};
	
	ComponentInstance.prototype.isPlaying = function(portType){
		if(typeof(this.plays) !== 'undefined')
			return false;
		
		var playing = this.plays.portTypeName == portType.portTypeName;
		
		return true;
	};

	ComponentInstance.prototype.pushRole = function(portType) {
		var oldBase = this.base;
					
		this.base = {};
		
		for(var prop in this){
			if(prop != this.base)
				this.base[prop] = this[prop];
		}
		
		this.base.base = oldBase;
		
		for(var prop in portType){
			this[prop] = portType[prop];
		}

		if(arguments.length>1 && typeof(arguments[1]) == 'object'){//apply adapter
			for(var prop in arguments[1]){
				this[prop] = arguments[1][prop];
			}
		}

		this.plays = portType;
	};
	
	ComponentInstance.prototype.popRole = function(){
		if(typeof(this.plays) !== 'undefined')
			return false;
				
		for(var prop in this.plays){
			delete(this[prop]);
		}
		for(var prop in this.base){
			this[prop] = base[prop];
		}
		
		return true;
	};
	
	ComponentType.prototype.createInstance = function(name) {
		var ci = new ComponentInstance(name,this);
		for(prop in this){
			ci[prop] = this[prop];
		}
		for(i=1;i<arguments.length;i++){
			var mixin = arguments[i];
			for(prop in mixin){
				ci[prop] = mixin[prop];
			}
		}
		return ci;
	};
	
	var RoleModel = function(name, initiation) {
		this.roleModelName = name;
		this.init = initiation;
		this.involvedObjects = new Array();
		this._smags_bindings = {};
	}
	
	RoleModel.prototype.bind = function(base,role){
		this.involvedObjects.push(base);
		
		if(typeof(arguments.length>2 && arguments[2]) == 'object'){//apply adapter
			base.pushRole(role,arguments[2]);
		} else {
			base.pushRole(role);
		}
		
		base._smags_context = this;
		this._smags_bindings[role.portTypeName] = base;
		base.getPlayer = function(portTypeName){
			return this._smags_context._smags_bindings[portTypeName];
		};
	}
	
	RoleModel.prototype.activate = function(){
		this.init.apply(this,arguments);
		for(i=0;i<this.involvedObjects.length;i++){
			this.involvedObjects[i].activate();
		}
	};
	
	RoleModel.prototype.deactivate = function(){
		for(i=0;i<this.involvedObjects.length;i++){
			this.involvedObjects[i].deactivate();
			delete(this.involvedObjects[i]._smags_context);
			delete(this.involvedObjects[i].getPlayer);
		}
		for(i=0;i<this.involvedObjects.length;i++){
			while(this.involvedObjects[i].popRole());
		}
		
		this._smags_bindings = {};
		this.involvedObjects = new Array();
	};
	
	return {
		componentTypes : componentTypes,
		portTypes : portTypes,
		roleModels: roleModels,
		
		createPortType : function(portTypeName,parent){
			var pt = new PortType(portTypeName);
			for(var prop in parent)
				pt[prop] = parent[prop];
			portTypes[portTypeName] = pt;
			return pt;
		},
		
		createComponentType : function(componentTypeName){
			var ct = new ComponentType(componentTypeName)
			for(i=1;i<arguments.length;i++){
				var mixin = arguments[i];
				for(var prop in mixin)
					ct[prop] = mixin[prop];
			}
			componentTypes[componentTypeName] = ct;			
			return ct;
		},
		
		createRoleModel : function(roleModelName, initiation){
			var rm = new RoleModel(roleModelName,initiation);
			roleModels[roleModelName] = rm;
			return rm;
		}
	};
})();

module.exports=smags;
