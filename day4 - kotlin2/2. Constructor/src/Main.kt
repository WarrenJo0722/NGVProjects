fun main() {
    val obj1 = TestClass1()

    val obj2 = TestClass2()
    println("obj2.v1: ${obj2.v1}")
    println("obj2.v2: ${obj2.v2}")

    val obj3 = TestClass2(100, 200)
    println("obj3.v1: ${obj3.v1}")
    println("obj3.v2: ${obj3.v2}")

    val obj4 = TestClass3(1000, 2000)
    println("obj4.a1: ${obj4.a1}")
    println("obj4.a2: ${obj4.a2}")

    val obj5 = TestClass4(10000, 20000)
    println("obj5.a1: ${obj5.a1}")
    println("obj5.a2: ${obj5.a2}")

    println("------------------------------------")

    val obj7 = TestClass4(100)
}

class TestClass1 {
    init {
        println("객체가 생성되면 자동으로 동작되는 부분입니다.")
    }
}

class TestClass2 {
    var v1: Int = 0
    var v2: Int = 0

    constructor() {
        println("매개변수가 없는 생성자")
    }

    constructor(a1: Int, a2: Int) {
        println("매개변수가 두 개인 생성자")
        v1 = a1
        v2 = a2
    }
}

// 기본 생성자(주 생성자): 매개변수가 멤버 변수로 자동 생성 된다.
//class TestClass3 constructor(var a1: Int, val a2: Int)
class TestClass3(var a1: Int, val a2: Int)


class TestClass4(var a1: Int, val a2: Int) {
    init { // 생성자가 먼저 호출되는지 init 블록이 먼저 호출되는지 확인.
        println("init 코드 수행")
        println("a1: $a1")
        println("a2: $a2")
    }

    constructor(a1: Int) : this(a1, 100) {
        println("보조 생성자 호출")
    }
}