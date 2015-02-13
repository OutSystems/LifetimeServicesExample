﻿//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Runtime Version:4.0.30319.34209
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// 
// This source code was auto-generated by Microsoft.VSDesigner, Version 4.0.30319.34209.
// 
#pragma warning disable 1591

namespace LifetimeIntegration.LifetimeRoles {
    using System;
    using System.Web.Services;
    using System.Diagnostics;
    using System.Web.Services.Protocols;
    using System.Xml.Serialization;
    using System.ComponentModel;
    
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Web.Services", "4.0.30319.34209")]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Web.Services.WebServiceBindingAttribute(Name="RoleManagementServiceSoap", Namespace="http://LifeTimeServices/RoleManagementService/")]
    public partial class RoleManagementService : System.Web.Services.Protocols.SoapHttpClientProtocol {
        
        private System.Threading.SendOrPostCallback Role_UpdatePermissionOperationCompleted;
        
        private System.Threading.SendOrPostCallback Role_DeleteOperationCompleted;
        
        private System.Threading.SendOrPostCallback Role_ChangeNameOperationCompleted;
        
        private System.Threading.SendOrPostCallback Role_CreateOrUpdateOperationCompleted;
        
        private System.Threading.SendOrPostCallback Role_ListOperationCompleted;
        
        private System.Threading.SendOrPostCallback Role_GetPermissionsOperationCompleted;
        
        private bool useDefaultCredentialsSetExplicitly;
        
        /// <remarks/>
        public RoleManagementService() {
            this.Url = global::LifetimeIntegration.Properties.Settings.Default.LifetimeIntegration_LifetimeRoles_RoleManagementService;
            if ((this.IsLocalFileSystemWebService(this.Url) == true)) {
                this.UseDefaultCredentials = true;
                this.useDefaultCredentialsSetExplicitly = false;
            }
            else {
                this.useDefaultCredentialsSetExplicitly = true;
            }
        }
        
        public new string Url {
            get {
                return base.Url;
            }
            set {
                if ((((this.IsLocalFileSystemWebService(base.Url) == true) 
                            && (this.useDefaultCredentialsSetExplicitly == false)) 
                            && (this.IsLocalFileSystemWebService(value) == false))) {
                    base.UseDefaultCredentials = false;
                }
                base.Url = value;
            }
        }
        
        public new bool UseDefaultCredentials {
            get {
                return base.UseDefaultCredentials;
            }
            set {
                base.UseDefaultCredentials = value;
                this.useDefaultCredentialsSetExplicitly = true;
            }
        }
        
        /// <remarks/>
        public event Role_UpdatePermissionCompletedEventHandler Role_UpdatePermissionCompleted;
        
        /// <remarks/>
        public event Role_DeleteCompletedEventHandler Role_DeleteCompleted;
        
        /// <remarks/>
        public event Role_ChangeNameCompletedEventHandler Role_ChangeNameCompleted;
        
        /// <remarks/>
        public event Role_CreateOrUpdateCompletedEventHandler Role_CreateOrUpdateCompleted;
        
        /// <remarks/>
        public event Role_ListCompletedEventHandler Role_ListCompleted;
        
        /// <remarks/>
        public event Role_GetPermissionsCompletedEventHandler Role_GetPermissionsCompleted;
        
        /// <remarks/>
        [System.Web.Services.Protocols.SoapDocumentMethodAttribute("http://LifeTimeServices/RoleManagementService/Role_UpdatePermission", RequestNamespace="http://www.outsystems.com", ResponseNamespace="http://www.outsystems.com", Use=System.Web.Services.Description.SoapBindingUse.Literal, ParameterStyle=System.Web.Services.Protocols.SoapParameterStyle.Wrapped)]
        [return: System.Xml.Serialization.XmlElementAttribute("Status")]
        public APIStatus Role_UpdatePermission(WebServiceSimpleAuthentication Authentication, string RoleName, string EnvironmentKey, int NewPermissionLevelId, out bool Success) {
            object[] results = this.Invoke("Role_UpdatePermission", new object[] {
                        Authentication,
                        RoleName,
                        EnvironmentKey,
                        NewPermissionLevelId});
            Success = ((bool)(results[1]));
            return ((APIStatus)(results[0]));
        }
        
        /// <remarks/>
        public void Role_UpdatePermissionAsync(WebServiceSimpleAuthentication Authentication, string RoleName, string EnvironmentKey, int NewPermissionLevelId) {
            this.Role_UpdatePermissionAsync(Authentication, RoleName, EnvironmentKey, NewPermissionLevelId, null);
        }
        
        /// <remarks/>
        public void Role_UpdatePermissionAsync(WebServiceSimpleAuthentication Authentication, string RoleName, string EnvironmentKey, int NewPermissionLevelId, object userState) {
            if ((this.Role_UpdatePermissionOperationCompleted == null)) {
                this.Role_UpdatePermissionOperationCompleted = new System.Threading.SendOrPostCallback(this.OnRole_UpdatePermissionOperationCompleted);
            }
            this.InvokeAsync("Role_UpdatePermission", new object[] {
                        Authentication,
                        RoleName,
                        EnvironmentKey,
                        NewPermissionLevelId}, this.Role_UpdatePermissionOperationCompleted, userState);
        }
        
        private void OnRole_UpdatePermissionOperationCompleted(object arg) {
            if ((this.Role_UpdatePermissionCompleted != null)) {
                System.Web.Services.Protocols.InvokeCompletedEventArgs invokeArgs = ((System.Web.Services.Protocols.InvokeCompletedEventArgs)(arg));
                this.Role_UpdatePermissionCompleted(this, new Role_UpdatePermissionCompletedEventArgs(invokeArgs.Results, invokeArgs.Error, invokeArgs.Cancelled, invokeArgs.UserState));
            }
        }
        
        /// <remarks/>
        [System.Web.Services.Protocols.SoapDocumentMethodAttribute("http://LifeTimeServices/RoleManagementService/Role_Delete", RequestNamespace="http://www.outsystems.com", ResponseNamespace="http://www.outsystems.com", Use=System.Web.Services.Description.SoapBindingUse.Literal, ParameterStyle=System.Web.Services.Protocols.SoapParameterStyle.Wrapped)]
        [return: System.Xml.Serialization.XmlArrayAttribute("AffectedPlatformUsers")]
        public PlatformUser[] Role_Delete(WebServiceSimpleAuthentication Authentication, string RoleName, string UsersNewRoleName, out APIStatus Status, out bool Success) {
            object[] results = this.Invoke("Role_Delete", new object[] {
                        Authentication,
                        RoleName,
                        UsersNewRoleName});
            Status = ((APIStatus)(results[1]));
            Success = ((bool)(results[2]));
            return ((PlatformUser[])(results[0]));
        }
        
        /// <remarks/>
        public void Role_DeleteAsync(WebServiceSimpleAuthentication Authentication, string RoleName, string UsersNewRoleName) {
            this.Role_DeleteAsync(Authentication, RoleName, UsersNewRoleName, null);
        }
        
        /// <remarks/>
        public void Role_DeleteAsync(WebServiceSimpleAuthentication Authentication, string RoleName, string UsersNewRoleName, object userState) {
            if ((this.Role_DeleteOperationCompleted == null)) {
                this.Role_DeleteOperationCompleted = new System.Threading.SendOrPostCallback(this.OnRole_DeleteOperationCompleted);
            }
            this.InvokeAsync("Role_Delete", new object[] {
                        Authentication,
                        RoleName,
                        UsersNewRoleName}, this.Role_DeleteOperationCompleted, userState);
        }
        
        private void OnRole_DeleteOperationCompleted(object arg) {
            if ((this.Role_DeleteCompleted != null)) {
                System.Web.Services.Protocols.InvokeCompletedEventArgs invokeArgs = ((System.Web.Services.Protocols.InvokeCompletedEventArgs)(arg));
                this.Role_DeleteCompleted(this, new Role_DeleteCompletedEventArgs(invokeArgs.Results, invokeArgs.Error, invokeArgs.Cancelled, invokeArgs.UserState));
            }
        }
        
        /// <remarks/>
        [System.Web.Services.Protocols.SoapDocumentMethodAttribute("http://LifeTimeServices/RoleManagementService/Role_ChangeName", RequestNamespace="http://www.outsystems.com", ResponseNamespace="http://www.outsystems.com", Use=System.Web.Services.Description.SoapBindingUse.Literal, ParameterStyle=System.Web.Services.Protocols.SoapParameterStyle.Wrapped)]
        [return: System.Xml.Serialization.XmlElementAttribute("Status")]
        public APIStatus Role_ChangeName(WebServiceSimpleAuthentication Authentication, string OldRoleName, string NewRoleName, out bool Success) {
            object[] results = this.Invoke("Role_ChangeName", new object[] {
                        Authentication,
                        OldRoleName,
                        NewRoleName});
            Success = ((bool)(results[1]));
            return ((APIStatus)(results[0]));
        }
        
        /// <remarks/>
        public void Role_ChangeNameAsync(WebServiceSimpleAuthentication Authentication, string OldRoleName, string NewRoleName) {
            this.Role_ChangeNameAsync(Authentication, OldRoleName, NewRoleName, null);
        }
        
        /// <remarks/>
        public void Role_ChangeNameAsync(WebServiceSimpleAuthentication Authentication, string OldRoleName, string NewRoleName, object userState) {
            if ((this.Role_ChangeNameOperationCompleted == null)) {
                this.Role_ChangeNameOperationCompleted = new System.Threading.SendOrPostCallback(this.OnRole_ChangeNameOperationCompleted);
            }
            this.InvokeAsync("Role_ChangeName", new object[] {
                        Authentication,
                        OldRoleName,
                        NewRoleName}, this.Role_ChangeNameOperationCompleted, userState);
        }
        
        private void OnRole_ChangeNameOperationCompleted(object arg) {
            if ((this.Role_ChangeNameCompleted != null)) {
                System.Web.Services.Protocols.InvokeCompletedEventArgs invokeArgs = ((System.Web.Services.Protocols.InvokeCompletedEventArgs)(arg));
                this.Role_ChangeNameCompleted(this, new Role_ChangeNameCompletedEventArgs(invokeArgs.Results, invokeArgs.Error, invokeArgs.Cancelled, invokeArgs.UserState));
            }
        }
        
        /// <remarks/>
        [System.Web.Services.Protocols.SoapDocumentMethodAttribute("http://LifeTimeServices/RoleManagementService/Role_CreateOrUpdate", RequestNamespace="http://www.outsystems.com", ResponseNamespace="http://www.outsystems.com", Use=System.Web.Services.Description.SoapBindingUse.Literal, ParameterStyle=System.Web.Services.Protocols.SoapParameterStyle.Wrapped)]
        [return: System.Xml.Serialization.XmlElementAttribute("PlatformRole")]
        public PlatformRole Role_CreateOrUpdate(WebServiceSimpleAuthentication Authentication, string RoleName, bool CanConfigureInfrastructure, string RoleDescription, out APIStatus Status, out bool Success) {
            object[] results = this.Invoke("Role_CreateOrUpdate", new object[] {
                        Authentication,
                        RoleName,
                        CanConfigureInfrastructure,
                        RoleDescription});
            Status = ((APIStatus)(results[1]));
            Success = ((bool)(results[2]));
            return ((PlatformRole)(results[0]));
        }
        
        /// <remarks/>
        public void Role_CreateOrUpdateAsync(WebServiceSimpleAuthentication Authentication, string RoleName, bool CanConfigureInfrastructure, string RoleDescription) {
            this.Role_CreateOrUpdateAsync(Authentication, RoleName, CanConfigureInfrastructure, RoleDescription, null);
        }
        
        /// <remarks/>
        public void Role_CreateOrUpdateAsync(WebServiceSimpleAuthentication Authentication, string RoleName, bool CanConfigureInfrastructure, string RoleDescription, object userState) {
            if ((this.Role_CreateOrUpdateOperationCompleted == null)) {
                this.Role_CreateOrUpdateOperationCompleted = new System.Threading.SendOrPostCallback(this.OnRole_CreateOrUpdateOperationCompleted);
            }
            this.InvokeAsync("Role_CreateOrUpdate", new object[] {
                        Authentication,
                        RoleName,
                        CanConfigureInfrastructure,
                        RoleDescription}, this.Role_CreateOrUpdateOperationCompleted, userState);
        }
        
        private void OnRole_CreateOrUpdateOperationCompleted(object arg) {
            if ((this.Role_CreateOrUpdateCompleted != null)) {
                System.Web.Services.Protocols.InvokeCompletedEventArgs invokeArgs = ((System.Web.Services.Protocols.InvokeCompletedEventArgs)(arg));
                this.Role_CreateOrUpdateCompleted(this, new Role_CreateOrUpdateCompletedEventArgs(invokeArgs.Results, invokeArgs.Error, invokeArgs.Cancelled, invokeArgs.UserState));
            }
        }
        
        /// <remarks/>
        [System.Web.Services.Protocols.SoapDocumentMethodAttribute("http://LifeTimeServices/RoleManagementService/Role_List", RequestNamespace="http://www.outsystems.com", ResponseNamespace="http://www.outsystems.com", Use=System.Web.Services.Description.SoapBindingUse.Literal, ParameterStyle=System.Web.Services.Protocols.SoapParameterStyle.Wrapped)]
        [return: System.Xml.Serialization.XmlArrayAttribute("PlatformRoles")]
        public PlatformRole[] Role_List(WebServiceSimpleAuthentication Authentication, out APIStatus Status, out bool Success) {
            object[] results = this.Invoke("Role_List", new object[] {
                        Authentication});
            Status = ((APIStatus)(results[1]));
            Success = ((bool)(results[2]));
            return ((PlatformRole[])(results[0]));
        }
        
        /// <remarks/>
        public void Role_ListAsync(WebServiceSimpleAuthentication Authentication) {
            this.Role_ListAsync(Authentication, null);
        }
        
        /// <remarks/>
        public void Role_ListAsync(WebServiceSimpleAuthentication Authentication, object userState) {
            if ((this.Role_ListOperationCompleted == null)) {
                this.Role_ListOperationCompleted = new System.Threading.SendOrPostCallback(this.OnRole_ListOperationCompleted);
            }
            this.InvokeAsync("Role_List", new object[] {
                        Authentication}, this.Role_ListOperationCompleted, userState);
        }
        
        private void OnRole_ListOperationCompleted(object arg) {
            if ((this.Role_ListCompleted != null)) {
                System.Web.Services.Protocols.InvokeCompletedEventArgs invokeArgs = ((System.Web.Services.Protocols.InvokeCompletedEventArgs)(arg));
                this.Role_ListCompleted(this, new Role_ListCompletedEventArgs(invokeArgs.Results, invokeArgs.Error, invokeArgs.Cancelled, invokeArgs.UserState));
            }
        }
        
        /// <remarks/>
        [System.Web.Services.Protocols.SoapDocumentMethodAttribute("http://LifeTimeServices/RoleManagementService/Role_GetPermissions", RequestNamespace="http://www.outsystems.com", ResponseNamespace="http://www.outsystems.com", Use=System.Web.Services.Description.SoapBindingUse.Literal, ParameterStyle=System.Web.Services.Protocols.SoapParameterStyle.Wrapped)]
        [return: System.Xml.Serialization.XmlArrayAttribute("PlatformRolePermissions")]
        public EnvironmentPermissionForRole[] Role_GetPermissions(WebServiceSimpleAuthentication Authentication, string RoleName, out APIStatus Status, out bool Success) {
            object[] results = this.Invoke("Role_GetPermissions", new object[] {
                        Authentication,
                        RoleName});
            Status = ((APIStatus)(results[1]));
            Success = ((bool)(results[2]));
            return ((EnvironmentPermissionForRole[])(results[0]));
        }
        
        /// <remarks/>
        public void Role_GetPermissionsAsync(WebServiceSimpleAuthentication Authentication, string RoleName) {
            this.Role_GetPermissionsAsync(Authentication, RoleName, null);
        }
        
        /// <remarks/>
        public void Role_GetPermissionsAsync(WebServiceSimpleAuthentication Authentication, string RoleName, object userState) {
            if ((this.Role_GetPermissionsOperationCompleted == null)) {
                this.Role_GetPermissionsOperationCompleted = new System.Threading.SendOrPostCallback(this.OnRole_GetPermissionsOperationCompleted);
            }
            this.InvokeAsync("Role_GetPermissions", new object[] {
                        Authentication,
                        RoleName}, this.Role_GetPermissionsOperationCompleted, userState);
        }
        
        private void OnRole_GetPermissionsOperationCompleted(object arg) {
            if ((this.Role_GetPermissionsCompleted != null)) {
                System.Web.Services.Protocols.InvokeCompletedEventArgs invokeArgs = ((System.Web.Services.Protocols.InvokeCompletedEventArgs)(arg));
                this.Role_GetPermissionsCompleted(this, new Role_GetPermissionsCompletedEventArgs(invokeArgs.Results, invokeArgs.Error, invokeArgs.Cancelled, invokeArgs.UserState));
            }
        }
        
        /// <remarks/>
        public new void CancelAsync(object userState) {
            base.CancelAsync(userState);
        }
        
        private bool IsLocalFileSystemWebService(string url) {
            if (((url == null) 
                        || (url == string.Empty))) {
                return false;
            }
            System.Uri wsUri = new System.Uri(url);
            if (((wsUri.Port >= 1024) 
                        && (string.Compare(wsUri.Host, "localHost", System.StringComparison.OrdinalIgnoreCase) == 0))) {
                return true;
            }
            return false;
        }
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Xml", "4.0.30319.34234")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(Namespace="http://www.outsystems.com")]
    public partial class WebServiceSimpleAuthentication {
        
        private string usernameField;
        
        private string passwordField;
        
        private string tokenField;
        
        /// <remarks/>
        public string Username {
            get {
                return this.usernameField;
            }
            set {
                this.usernameField = value;
            }
        }
        
        /// <remarks/>
        public string Password {
            get {
                return this.passwordField;
            }
            set {
                this.passwordField = value;
            }
        }
        
        /// <remarks/>
        public string Token {
            get {
                return this.tokenField;
            }
            set {
                this.tokenField = value;
            }
        }
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Xml", "4.0.30319.34234")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(Namespace="http://www.outsystems.com")]
    public partial class EnvironmentPermissionForRole {
        
        private string environmentKeyField;
        
        private string environmentNameField;
        
        private string environmentHostField;
        
        private string environmentTypeField;
        
        private int environmentPermissionLevelIdField;
        
        /// <remarks/>
        public string EnvironmentKey {
            get {
                return this.environmentKeyField;
            }
            set {
                this.environmentKeyField = value;
            }
        }
        
        /// <remarks/>
        public string EnvironmentName {
            get {
                return this.environmentNameField;
            }
            set {
                this.environmentNameField = value;
            }
        }
        
        /// <remarks/>
        public string EnvironmentHost {
            get {
                return this.environmentHostField;
            }
            set {
                this.environmentHostField = value;
            }
        }
        
        /// <remarks/>
        public string EnvironmentType {
            get {
                return this.environmentTypeField;
            }
            set {
                this.environmentTypeField = value;
            }
        }
        
        /// <remarks/>
        public int EnvironmentPermissionLevelId {
            get {
                return this.environmentPermissionLevelIdField;
            }
            set {
                this.environmentPermissionLevelIdField = value;
            }
        }
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Xml", "4.0.30319.34234")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(Namespace="http://www.outsystems.com")]
    public partial class PlatformRole {
        
        private int idField;
        
        private string nameField;
        
        private string descriptionField;
        
        private bool canManageInfrastructureField;
        
        private bool isProtectedField;
        
        private bool allowChangePermissionsField;
        
        private EnvironmentPermissionForRole[] permissionsPerEnvironmentField;
        
        /// <remarks/>
        public int Id {
            get {
                return this.idField;
            }
            set {
                this.idField = value;
            }
        }
        
        /// <remarks/>
        public string Name {
            get {
                return this.nameField;
            }
            set {
                this.nameField = value;
            }
        }
        
        /// <remarks/>
        public string Description {
            get {
                return this.descriptionField;
            }
            set {
                this.descriptionField = value;
            }
        }
        
        /// <remarks/>
        public bool CanManageInfrastructure {
            get {
                return this.canManageInfrastructureField;
            }
            set {
                this.canManageInfrastructureField = value;
            }
        }
        
        /// <remarks/>
        public bool IsProtected {
            get {
                return this.isProtectedField;
            }
            set {
                this.isProtectedField = value;
            }
        }
        
        /// <remarks/>
        public bool AllowChangePermissions {
            get {
                return this.allowChangePermissionsField;
            }
            set {
                this.allowChangePermissionsField = value;
            }
        }
        
        /// <remarks/>
        public EnvironmentPermissionForRole[] PermissionsPerEnvironment {
            get {
                return this.permissionsPerEnvironmentField;
            }
            set {
                this.permissionsPerEnvironmentField = value;
            }
        }
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Xml", "4.0.30319.34234")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(Namespace="http://www.outsystems.com")]
    public partial class PlatformUser {
        
        private int idField;
        
        private string usernameField;
        
        private string nameField;
        
        private string emailField;
        
        private string roleNameField;
        
        /// <remarks/>
        public int Id {
            get {
                return this.idField;
            }
            set {
                this.idField = value;
            }
        }
        
        /// <remarks/>
        public string Username {
            get {
                return this.usernameField;
            }
            set {
                this.usernameField = value;
            }
        }
        
        /// <remarks/>
        public string Name {
            get {
                return this.nameField;
            }
            set {
                this.nameField = value;
            }
        }
        
        /// <remarks/>
        public string Email {
            get {
                return this.emailField;
            }
            set {
                this.emailField = value;
            }
        }
        
        /// <remarks/>
        public string RoleName {
            get {
                return this.roleNameField;
            }
            set {
                this.roleNameField = value;
            }
        }
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Xml", "4.0.30319.34234")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(Namespace="http://www.outsystems.com")]
    public partial class APIStatus {
        
        private int idField;
        
        private int responseIdField;
        
        private string responseMessageField;
        
        private string responseAdditionalInfoField;
        
        /// <remarks/>
        public int Id {
            get {
                return this.idField;
            }
            set {
                this.idField = value;
            }
        }
        
        /// <remarks/>
        public int ResponseId {
            get {
                return this.responseIdField;
            }
            set {
                this.responseIdField = value;
            }
        }
        
        /// <remarks/>
        public string ResponseMessage {
            get {
                return this.responseMessageField;
            }
            set {
                this.responseMessageField = value;
            }
        }
        
        /// <remarks/>
        public string ResponseAdditionalInfo {
            get {
                return this.responseAdditionalInfoField;
            }
            set {
                this.responseAdditionalInfoField = value;
            }
        }
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Web.Services", "4.0.30319.34209")]
    public delegate void Role_UpdatePermissionCompletedEventHandler(object sender, Role_UpdatePermissionCompletedEventArgs e);
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Web.Services", "4.0.30319.34209")]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    public partial class Role_UpdatePermissionCompletedEventArgs : System.ComponentModel.AsyncCompletedEventArgs {
        
        private object[] results;
        
        internal Role_UpdatePermissionCompletedEventArgs(object[] results, System.Exception exception, bool cancelled, object userState) : 
                base(exception, cancelled, userState) {
            this.results = results;
        }
        
        /// <remarks/>
        public APIStatus Result {
            get {
                this.RaiseExceptionIfNecessary();
                return ((APIStatus)(this.results[0]));
            }
        }
        
        /// <remarks/>
        public bool Success {
            get {
                this.RaiseExceptionIfNecessary();
                return ((bool)(this.results[1]));
            }
        }
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Web.Services", "4.0.30319.34209")]
    public delegate void Role_DeleteCompletedEventHandler(object sender, Role_DeleteCompletedEventArgs e);
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Web.Services", "4.0.30319.34209")]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    public partial class Role_DeleteCompletedEventArgs : System.ComponentModel.AsyncCompletedEventArgs {
        
        private object[] results;
        
        internal Role_DeleteCompletedEventArgs(object[] results, System.Exception exception, bool cancelled, object userState) : 
                base(exception, cancelled, userState) {
            this.results = results;
        }
        
        /// <remarks/>
        public PlatformUser[] Result {
            get {
                this.RaiseExceptionIfNecessary();
                return ((PlatformUser[])(this.results[0]));
            }
        }
        
        /// <remarks/>
        public APIStatus Status {
            get {
                this.RaiseExceptionIfNecessary();
                return ((APIStatus)(this.results[1]));
            }
        }
        
        /// <remarks/>
        public bool Success {
            get {
                this.RaiseExceptionIfNecessary();
                return ((bool)(this.results[2]));
            }
        }
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Web.Services", "4.0.30319.34209")]
    public delegate void Role_ChangeNameCompletedEventHandler(object sender, Role_ChangeNameCompletedEventArgs e);
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Web.Services", "4.0.30319.34209")]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    public partial class Role_ChangeNameCompletedEventArgs : System.ComponentModel.AsyncCompletedEventArgs {
        
        private object[] results;
        
        internal Role_ChangeNameCompletedEventArgs(object[] results, System.Exception exception, bool cancelled, object userState) : 
                base(exception, cancelled, userState) {
            this.results = results;
        }
        
        /// <remarks/>
        public APIStatus Result {
            get {
                this.RaiseExceptionIfNecessary();
                return ((APIStatus)(this.results[0]));
            }
        }
        
        /// <remarks/>
        public bool Success {
            get {
                this.RaiseExceptionIfNecessary();
                return ((bool)(this.results[1]));
            }
        }
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Web.Services", "4.0.30319.34209")]
    public delegate void Role_CreateOrUpdateCompletedEventHandler(object sender, Role_CreateOrUpdateCompletedEventArgs e);
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Web.Services", "4.0.30319.34209")]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    public partial class Role_CreateOrUpdateCompletedEventArgs : System.ComponentModel.AsyncCompletedEventArgs {
        
        private object[] results;
        
        internal Role_CreateOrUpdateCompletedEventArgs(object[] results, System.Exception exception, bool cancelled, object userState) : 
                base(exception, cancelled, userState) {
            this.results = results;
        }
        
        /// <remarks/>
        public PlatformRole Result {
            get {
                this.RaiseExceptionIfNecessary();
                return ((PlatformRole)(this.results[0]));
            }
        }
        
        /// <remarks/>
        public APIStatus Status {
            get {
                this.RaiseExceptionIfNecessary();
                return ((APIStatus)(this.results[1]));
            }
        }
        
        /// <remarks/>
        public bool Success {
            get {
                this.RaiseExceptionIfNecessary();
                return ((bool)(this.results[2]));
            }
        }
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Web.Services", "4.0.30319.34209")]
    public delegate void Role_ListCompletedEventHandler(object sender, Role_ListCompletedEventArgs e);
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Web.Services", "4.0.30319.34209")]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    public partial class Role_ListCompletedEventArgs : System.ComponentModel.AsyncCompletedEventArgs {
        
        private object[] results;
        
        internal Role_ListCompletedEventArgs(object[] results, System.Exception exception, bool cancelled, object userState) : 
                base(exception, cancelled, userState) {
            this.results = results;
        }
        
        /// <remarks/>
        public PlatformRole[] Result {
            get {
                this.RaiseExceptionIfNecessary();
                return ((PlatformRole[])(this.results[0]));
            }
        }
        
        /// <remarks/>
        public APIStatus Status {
            get {
                this.RaiseExceptionIfNecessary();
                return ((APIStatus)(this.results[1]));
            }
        }
        
        /// <remarks/>
        public bool Success {
            get {
                this.RaiseExceptionIfNecessary();
                return ((bool)(this.results[2]));
            }
        }
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Web.Services", "4.0.30319.34209")]
    public delegate void Role_GetPermissionsCompletedEventHandler(object sender, Role_GetPermissionsCompletedEventArgs e);
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Web.Services", "4.0.30319.34209")]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    public partial class Role_GetPermissionsCompletedEventArgs : System.ComponentModel.AsyncCompletedEventArgs {
        
        private object[] results;
        
        internal Role_GetPermissionsCompletedEventArgs(object[] results, System.Exception exception, bool cancelled, object userState) : 
                base(exception, cancelled, userState) {
            this.results = results;
        }
        
        /// <remarks/>
        public EnvironmentPermissionForRole[] Result {
            get {
                this.RaiseExceptionIfNecessary();
                return ((EnvironmentPermissionForRole[])(this.results[0]));
            }
        }
        
        /// <remarks/>
        public APIStatus Status {
            get {
                this.RaiseExceptionIfNecessary();
                return ((APIStatus)(this.results[1]));
            }
        }
        
        /// <remarks/>
        public bool Success {
            get {
                this.RaiseExceptionIfNecessary();
                return ((bool)(this.results[2]));
            }
        }
    }
}

#pragma warning restore 1591