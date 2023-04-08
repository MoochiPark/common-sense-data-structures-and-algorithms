package chapter08

//fun statusCodeMeaning(number: Number): String =
//    when (number) {
//        200 -> "OK"
//        301 -> "Moved Permanently"
//        401 -> "Unauthorized"
//        404 -> "Not Found"
//        500 -> "Internal Server Error"
//        else -> "Unknown"
//    }

val STATUS_CODE = hashMapOf(
    200 to "OK",
    301 to "Moved Permanently",
    401 to "Unauthorized",
    404 to "Not Found",
    500 to "Internal Server Error"
)

fun statusCodeMeaning(number: Number): String? =
    STATUS_CODE[number]

fun main() {
    print(statusCodeMeaning(404))
}