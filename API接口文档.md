# common服务

##  1、IdWork/createUniqueId

**接口描述：** 生成唯一id

**接口入参**

```json

```

**返回参数**

```json
id:String
```

# order 服务

##  1、order/createOrder/{goodsId}

**接口描述：** 创建订单（秒杀）

**接口入参**

```json
@PathParam("goodsId") String goodsId,HttpRequest request
```

**返回参数**

```json

result{
    code:Integer,
    msg:String,
    data:{
    orderid:Long
},
}
```

##  2、order/getOrder/{orderId}

**接口描述：** 创建订单（秒杀）

**接口入参**

```json
@PathParam("orderId") String orderId
```

**返回参数**

```json
result{
    code:Integer,
    msg:String,
    data:{
    miaoshaOrder:{
    orderId:Long,
    miaoshaPrice:Double,
    goodsId:Long,   
}
},
}
```

##  3、order/payOrder/{orderId}

**接口描述：** 创建订单（秒杀）

**接口入参**

```json
@PathParam("orderId") String orderId
```

**返回参数**

```json
result{
    code:Integer,
    msg:String,
    data:{
},
}
```

# product服务

# user服务

