# 练习1： 定义一个整数变量age， 编写代码判断年龄是否正确

age = int(input("请输入您的年龄："))

#要求人的年龄在0-120之间
if age >= 0 and age <= 120:
    print("您的年龄是%d" % age)
else:
    print("您输入的年龄有误，请输入0-120")

"""
age >= 0 age <=120

"""