package kotlinTest


class User(val id: Int, val name: String, val address: String)

//代码冗余
fun saveUser(user: User) {
    if (user.name.isEmpty()) {
        throw IllegalArgumentException("Cannot save user ${user.id}:Name is empty")
    }

    if (user.address.isEmpty()) {
        throw IllegalArgumentException("Cannot save user ${user.id}:Address is empty")
    }

    println("Save user!")
}

//代码清理第1步骤，抽取一个本地方法来验证任意字段
fun saveUserCleanStep1(user: User) {
    fun validate(user: User, value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Cannot save user ${user.id}:$fieldName is empty")
        }
    }
    validate(user, user.name, "Name")
    validate(user, user.address, "Address")
    println("Save user!")
}


//代码清理第2步骤，本地函数可以直接访问外部函数的参数，避免额外的user参数继续传递
fun saveUserCleanStep2(user: User) {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Cannot save user ${user.id}:$fieldName is empty")
        }
    }
    validate(user.name, "Name")
    validate(user.address, "Address")
    println("Save user!")
}

//代码清理第3步骤，将验证逻辑移动到User类的扩展函数中
fun saveUserCleanStep3(user: User) {
    user.validateBeforeSave()
    println("Save user!")
}

fun User.validateBeforeSave() {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Cannot save user $id:$fieldName is empty")
        }
    }
    validate(name, "Name")
    validate(address, "Address")
}


fun main(args: Array<String>) {
//    saveUser(User(1, "", ""))
//    saveUserCleanStep1(User(1, "", ""))
//    saveUserCleanStep2(User(1, "", ""))
    saveUserCleanStep3(User(1, "", ""))
}
