package pick_landing_server.global.error.exception

abstract class PickException(
    val errorCode: ErrorCode
) : RuntimeException()
