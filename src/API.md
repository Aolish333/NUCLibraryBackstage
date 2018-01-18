# 综述
图书馆实时管理系统API
#### API服务 
http://localhost:8080/swagger-ui.html
### URL 
Host: localhost:8080
BasePath: /
## 用户 API
学生用户的一些操作
### 登陆

### 选座
### 
## 管理员API
### 管理员登陆
请求方式：GET 

URL: Host: localhost:8080/administrator

JSON返回案例：

    {
      "code": 0,
       "msg": "string",
      "data": {
        "jobNumber": "string",
        "jurisdiction": 0,
        "password": "string"
      }
    }
    
### 修改用户信息

请求地址 ：localhost:8080/user

请求方式：PUT 

请求需要参数：


    
JSON返回案例：

    {
      "code": 0,
      "data": {
        "creditScore": 0,
        "studentID": "string",
        "password": "string"
      },
      "msg": "string"
    }

   
  
### 删除用户

### 查询所有用户信息

### 查询指定用户信息

### 创建教室