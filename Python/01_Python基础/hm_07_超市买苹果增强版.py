# 1. 输入苹果的单价
price_str = input("苹果的单价: ")

# 2. 输入苹果的重量
weight_str = input("苹果的重量: ")

# 3. 计算支付的总金额
# 注意：两个字符串变量之间是不能直接用乘法的
# money = price_str * weight_str
# 4. 将价格和重量转换成小数

price = float(price_str)

weight = float(weight_str)

# 5. 用转换后的小数计算总价格

money = price * weight

print("苹果的总价为: ")
print(money)

