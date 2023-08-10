webpackJsonp([7],{"+xLW":function(e,t){},"25Sm":function(e,t,a){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var o=a("vLgD"),r={shopList:function(e,t){return o.a._post("/admin/shop/index",e,t)},addShop:function(e,t){return o.a._post("/admin/shop/add",e,t)},editShop:function(e,t){return o.a._post("/admin/shop/edit",e,t)},updateStatus:function(e,t){return o.a._post("/admin/shop/updateStatus",e,t)},storeEnter:function(e,t){return o.a._post("/admin/shop/enter",e,t)},deleteShop:function(e,t){return o.a._post("/admin/shop/delete",e,t)}},i={data:function(){var e=this;return{form:{},formLabelWidth:"120px",dialogVisible:!1,loading:!1,rules:{app_name:[{validator:function(t,a,o){return a?e.$filter.isAllSpace(a)?o(new Error("不能全是空格")):void o():o(new Error("请输入商城名称"))},required:!0,trigger:"blur"}],user_name:[{validator:function(t,a,o){return e.$filter.replaceSpace(a)?e.$filter.hasSpace(a)?o(new Error("不能包含空格")):void o():o(new Error("商家账户名"))},required:!0,trigger:"blur"}],password:[{validator:function(t,a,o){if(a){if(e.$filter.hasSpace(a))return o(new Error("不能包含空格"));if(a.length<6)return o(new Error("长度不能小于6位"));o()}else o()},trigger:"change"}],password_confirm:[{validator:function(t,a,o){e.form.password&&a!==e.form.password?o(new Error("确认密码不一致")):o()},trigger:"blur"}]}}},props:["open_edit","curModel"],created:function(){this.dialogVisible=this.open_edit,this.form=this.curModel},methods:{addClick:function(){var e=this,t=this.form;e.$refs.form.validate(function(a){a&&(e.loading=!0,r.editShop(t,!0).then(function(t){e.loading=!1,e.$message({message:"恭喜你，修改成功",type:"success"}),e.dialogFormVisible(!0)}).catch(function(t){e.loading=!1}))})},dialogFormVisible:function(e){e?this.$emit("closeDialog",{type:"success",openDialog:!1}):this.$emit("closeDialog",{type:"error",openDialog:!1})}}},l={render:function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("el-dialog",{attrs:{title:"编辑小程序商城",visible:e.dialogVisible,"close-on-click-modal":!1,"close-on-press-escape":!1},on:{"update:visible":function(t){e.dialogVisible=t},close:e.dialogFormVisible}},[a("el-form",{ref:"form",attrs:{size:"small",model:e.form,rules:e.rules}},[a("div",{staticStyle:{height:"0",overflow:"hidden"}},[a("input",{attrs:{type:"password"}})]),e._v(" "),a("el-form-item",{attrs:{label:"商城名称","label-width":e.formLabelWidth,prop:"app_name"}},[a("el-input",{attrs:{autocomplete:"off",placeholder:"请输入商城名称"},model:{value:e.form.app_name,callback:function(t){e.$set(e.form,"app_name",t)},expression:"form.app_name"}})],1),e._v(" "),a("el-form-item",{attrs:{label:"商家账户名","label-width":e.formLabelWidth,prop:"user_name"}},[a("el-input",{attrs:{autocomplete:"off",placeholder:"请输入商家账户名"},model:{value:e.form.user_name,callback:function(t){e.$set(e.form,"user_name",t)},expression:"form.user_name"}}),e._v(" "),a("p",{staticClass:"gray"},[e._v("注：商家后台用户名")])],1),e._v(" "),a("el-form-item",{attrs:{label:"商家账户密码","label-width":e.formLabelWidth,prop:"password"}},[a("el-input",{attrs:{type:"password",autocomplete:"off",placeholder:"请输入密码"},model:{value:e.form.password,callback:function(t){e.$set(e.form,"password",t)},expression:"form.password"}}),e._v(" "),a("p",{staticClass:"gray"},[e._v("注：商家后台用户密码")])],1),e._v(" "),a("el-form-item",{attrs:{label:"确认密码","label-width":e.formLabelWidth,prop:"password_confirm"}},[a("el-input",{attrs:{type:"password",autocomplete:"off",placeholder:"请输入确认密码"},model:{value:e.form.password_confirm,callback:function(t){e.$set(e.form,"password_confirm",t)},expression:"form.password_confirm"}})],1)],1),e._v(" "),a("div",{staticClass:"dialog-footer",attrs:{slot:"footer"},slot:"footer"},[a("el-button",{on:{click:e.dialogFormVisible}},[e._v("取 消")]),e._v(" "),a("el-button",{attrs:{type:"primary",loading:e.loading},on:{click:function(t){return e.addClick()}}},[e._v("确 定")])],1)],1)},staticRenderFns:[]};var n=a("VU/8")(i,l,!1,function(e){a("Tczc")},null,null).exports,s={data:function(){var e=this;return{form:{is_chain:0},formLabelWidth:"120px",dialogVisible:!1,loading:!1,rules:{app_name:[{validator:function(t,a,o){return a?e.$filter.isAllSpace(a)?o(new Error("不能全是空格")):void o():o(new Error("请输入商城名称"))},required:!0,trigger:"blur"}],user_name:[{validator:function(t,a,o){return e.$filter.replaceSpace(a)?e.$filter.hasSpace(a)?o(new Error("不能包含空格")):void o():o(new Error("商家账户名"))},required:!0,trigger:"blur"}],password:[{validator:function(t,a,o){if(a){if(e.$filter.hasSpace(a))return o(new Error("不能包含空格"));if(a.length<6)return o(new Error("长度不能小于6位"));o()}else o(new Error("请输入密码"))},required:!0,trigger:"change"}],password_confirm:[{validator:function(t,a,o){a?a!==e.form.password?o(new Error("确认密码不一致")):o():o(new Error("请填写确认密码"))},required:!0,trigger:"blur"}]}}},props:["open_add"],created:function(){this.dialogVisible=this.open_add},methods:{addClick:function(){var e=this,t=this.form;e.$refs.form.validate(function(a){a&&(e.loading=!0,r.addShop(t,!0).then(function(t){e.loading=!1,1==t.code&&(e.$message({message:"恭喜你，添加成功",type:"success"}),e.dialogFormVisible(!0))}).catch(function(t){e.loading=!1}))})},dialogFormVisible:function(e){e?this.$emit("closeDialog",{type:"success",openDialog:!1}):this.$emit("closeDialog",{type:"error",openDialog:!1})}}},c={render:function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("el-dialog",{attrs:{title:"新增小程序商城",visible:e.dialogVisible,"close-on-click-modal":!1,"close-on-press-escape":!1},on:{"update:visible":function(t){e.dialogVisible=t},close:e.dialogFormVisible}},[a("el-form",{ref:"form",attrs:{size:"small",model:e.form,rules:e.rules}},[a("div",{staticStyle:{height:"0",overflow:"hidden"}},[a("input",{attrs:{type:"password"}})]),e._v(" "),a("el-form-item",{attrs:{label:"商城名称","label-width":e.formLabelWidth,prop:"app_name"}},[a("el-input",{attrs:{autocomplete:"off",placeholder:"请输入商城名称"},model:{value:e.form.app_name,callback:function(t){e.$set(e.form,"app_name",t)},expression:"form.app_name"}})],1),e._v(" "),a("el-form-item",{attrs:{label:"商家账户名","label-width":e.formLabelWidth,prop:"user_name"}},[a("el-input",{attrs:{autocomplete:"off",placeholder:"请输入商家账户名"},model:{value:e.form.user_name,callback:function(t){e.$set(e.form,"user_name",t)},expression:"form.user_name"}}),e._v(" "),a("p",{staticClass:"gray"},[e._v("注：商家后台用户名")])],1),e._v(" "),a("el-form-item",{attrs:{label:"商家账户密码","label-width":e.formLabelWidth,prop:"password"}},[a("el-input",{attrs:{type:"password",autocomplete:"off",placeholder:"请输入密码"},model:{value:e.form.password,callback:function(t){e.$set(e.form,"password",t)},expression:"form.password"}}),e._v(" "),a("p",{staticClass:"gray"},[e._v("注：商家后台用户密码")])],1),e._v(" "),a("el-form-item",{attrs:{label:"确认密码","label-width":e.formLabelWidth,prop:"password_confirm"}},[a("el-input",{attrs:{type:"password",autocomplete:"off",placeholder:"请输入确认密码"},model:{value:e.form.password_confirm,callback:function(t){e.$set(e.form,"password_confirm",t)},expression:"form.password_confirm"}})],1),e._v(" "),a("el-form-item",{attrs:{label:"是否连锁","label-width":e.formLabelWidth,prop:"is_chain"}},[a("div",[a("el-radio",{attrs:{label:1},model:{value:e.form.is_chain,callback:function(t){e.$set(e.form,"is_chain",t)},expression:"form.is_chain"}},[e._v("是")]),e._v(" "),a("el-radio",{attrs:{label:0},model:{value:e.form.is_chain,callback:function(t){e.$set(e.form,"is_chain",t)},expression:"form.is_chain"}},[e._v("否")])],1)])],1),e._v(" "),a("div",{staticClass:"dialog-footer",attrs:{slot:"footer"},slot:"footer"},[a("el-button",{on:{click:e.dialogFormVisible}},[e._v("取 消")]),e._v(" "),a("el-button",{attrs:{type:"primary",loading:e.loading},on:{click:function(t){return e.addClick()}}},[e._v("确 定")])],1)],1)},staticRenderFns:[]};var d=a("VU/8")(s,c,!1,function(e){a("LRec")},null,null).exports,p=a("aFVK"),u={components:{Edit:n,Add:d},data:function(){return{loading:!0,tableData:[],pageSize:20,totalDataNumber:0,curPage:1,open_add:!1,open_edit:!1,curModel:{}}},created:function(){this.getData()},methods:{handleCurrentChange:function(e){this.page=e,this.loading=!0,this.getData()},handleSizeChange:function(e){this.curPage=1,this.pageSize=e,this.getData()},getData:function(){var e=this;r.shopList({page:e.curPage,list_rows:e.pageSize},!0).then(function(t){e.loading=!1,e.tableData=t.data.list.data,e.totalDataNumber=t.data.list.total,e.tableData.forEach(function(e){e.status=1===e.status})}).catch(function(e){})},addClick:function(){this.open_add=!0},editClick:function(e){this.open_edit=!0,this.curModel=Object(p.a)(e)},closeDialogFunc:function(e,t){"add"==t&&(this.open_add=e.openDialog,"success"==e.type&&this.getData()),"edit"==t&&(this.open_edit=e.openDialog,"success"==e.type&&this.getData())},statusChange:function(e,t){var a=this;a.loading=!0,r.updateStatus({app_id:t.app_id},!0).then(function(o){a.loading=!1,t.status=e}).catch(function(o){a.loading=!1,t.status=!e})},deleteClick:function(e){var t=this;t.$confirm("删除后不可恢复，确认删除该记录吗?","提示",{confirmButtonText:"确定",cancelButtonText:"取消",type:"warning"}).then(function(){t.loading=!0,r.deleteShop({app_id:e.app_id},!0).then(function(e){t.loading=!1,1==e.code&&(t.$message({message:e.msg,type:"success"}),t.getTableList())}).catch(function(e){t.loading=!1})}).catch(function(){})},storeEnter:function(e){r.storeEnter({app_id:e},!0).then(function(e){}).catch(function(e){})}}},f={render:function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("div",{directives:[{name:"loading",rawName:"v-loading",value:e.loading,expression:"loading"}]},[a("div",{staticClass:"common-level-rail"},[a("el-button",{attrs:{size:"small",type:"primary"},on:{click:e.addClick}},[e._v("添加商城")])],1),e._v(" "),a("div",{staticClass:"product-content"},[a("div",{staticClass:"table-wrap"},[a("div",[a("el-table",{directives:[{name:"loading",rawName:"v-loading",value:e.loading,expression:"loading"}],staticStyle:{width:"100%"},attrs:{size:"small",data:e.tableData,"row-key":"access_id",border:"","default-expand-all":""}},[a("el-table-column",{attrs:{prop:"app_id",label:"商城ID"}}),e._v(" "),a("el-table-column",{attrs:{prop:"app_name",label:"商城名称"}}),e._v(" "),a("el-table-column",{attrs:{prop:"user_name",label:"超管账号"}}),e._v(" "),a("el-table-column",{attrs:{prop:"status",label:"状态"},scopedSlots:e._u([{key:"default",fn:function(t){return[a("el-checkbox",{on:{change:function(a){return e.statusChange(a,t.row)}},model:{value:t.row.status,callback:function(a){e.$set(t.row,"status",a)},expression:"scope.row.status"}},[e._v("启用")])]}}])}),e._v(" "),a("el-table-column",{attrs:{prop:"create_time",label:"添加时间"}}),e._v(" "),a("el-table-column",{attrs:{label:"操作",width:"150"},scopedSlots:e._u([{key:"default",fn:function(t){return[a("el-link",{attrs:{href:"/index.php/admin/shop/enter/app_id/"+t.row.app_id,target:"_blank",type:"text",size:"small"}},[e._v("进入商城")]),e._v(" "),a("el-link",{staticClass:"ml10",attrs:{type:"text",size:"small"},on:{click:function(a){return e.editClick(t.row)}}},[e._v("编辑")]),e._v(" "),a("el-link",{staticClass:"ml10",attrs:{type:"text",size:"small"},on:{click:function(a){return e.deleteClick(t.row)}}},[e._v("删除")])]}}])})],1)],1)])]),e._v(" "),e.open_add?a("Add",{attrs:{open_add:e.open_add},on:{closeDialog:function(t){return e.closeDialogFunc(t,"add")}}}):e._e(),e._v(" "),e.open_edit?a("Edit",{attrs:{open_edit:e.open_edit,curModel:e.curModel},on:{closeDialog:function(t){return e.closeDialogFunc(t,"edit")}}}):e._e(),e._v(" "),a("div",{staticClass:"pagination"},[a("el-pagination",{attrs:{background:"","current-page":e.curPage,"page-size":e.pageSize,layout:"total, prev, pager, next, jumper",total:e.totalDataNumber},on:{"size-change":e.handleSizeChange,"current-change":e.handleCurrentChange}})],1)],1)},staticRenderFns:[]};var m=a("VU/8")(u,f,!1,function(e){a("+xLW")},null,null);t.default=m.exports},LRec:function(e,t){},Tczc:function(e,t){}});
//# sourceMappingURL=7.eb3138f0cd084755adc4.js.map