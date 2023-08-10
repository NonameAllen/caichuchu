<template>
  <!--
      作者 luoyiming
      时间：2019-10-26
      描述：设置-商城设置
  -->
  <div class="product-add">
    <!--form表单-->
    <el-form size="small" ref="form" :model="form" label-width="150px">
      <!--添加门店-->
      <div class="common-form">商城设置</div>
      <el-form-item label="商城名称" :rules="[{required: true,message: ' '}]" prop="name">
        <el-input v-model="form.name" placeholder="商城名称" class="max-w460"></el-input>
      </el-form-item>
      <div class="common-form">日志记录</div>
      <el-form-item label="是否记录查询日志" prop="customer">
        <el-checkbox v-model="form.is_get_log">是否记录查询日志</el-checkbox>
        <div class="tips">如果记录，日志量会有点大</div>
      </el-form-item>
      <!--提交-->
      <div class="common-button-wrapper">
        <el-button type="primary" @click="onSubmit" :loading="loading">提交</el-button>
      </div>
    </el-form>

  </div>

</template>

<script>
  import SettingApi from '@/api/setting.js';
  import {
    formatModel
  } from '@/utils/base.js';
  export default {
    components: {},
    data() {
      return {
        /*是否正在加载*/
        loading: false,
        /*form表单数据*/
        form: {
          name: '',
          is_get_log: 0
        },
      };
    },
    created() {
      this.getParams()
    },
    methods: {
      /*获取配置数据*/
      getParams() {
        let self = this;
        SettingApi.storeDetail({}, true).then(res => {
            let vars = res.data.vars.values;
            self.form = formatModel(self.form, vars);
            self.loading = false;
          })
          .catch(error => {

          });
      },
      /*提交*/
      onSubmit() {
        let self = this;
        let params = this.form;
        self.$refs.form.validate((valid) => {
          if (valid) {
            self.loading = true;
            SettingApi.editStore(params, true)
              .then(data => {
                self.loading = false;
                self.$message({
                  message: '恭喜你，商城设置成功',
                  type: 'success'
                });
                self.$router.push('/setting/store/index');
              })
              .catch(error => {
                self.loading = false;
              });
          }
        });
      },
    }

  };
</script>
<style>
  .tips {
    color: #ccc;
  }

  input::-webkit-outer-spin-button,
  input::-webkit-inner-spin-button {
    -webkit-appearance: none;
  }

  input[type="number"] {
    -moz-appearance: textfield;
  }
</style>
