# 计算 0 - 100 之间所有数字的累加求和结果
# 0.定义一个最终结果变量
result = 0

# 1.定义一个整数的变量记录循环的次数
i = 0

# 2.开始循环
while i <= 100:
    print(i)
    # 每一次循环，都让result这个变量和i这个计数器相加
    result += i
    # 处理计数器
    i += 1

print("0 - 100 之间的数字求和结果是: %d" % result)