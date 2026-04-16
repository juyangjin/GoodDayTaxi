package com.gooddaytaxi.common.core.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {
    INVALID_INPUT_VALUE(ErrorLevel.BAD_REQUEST, "C001", "잘못된 입력값입니다."),
    INVALID_TYPE_VALUE(ErrorLevel.BAD_REQUEST, "C002", "잘못된 타입의 값입니다."),
    MISSING_REQUEST_PARAMETER(ErrorLevel.BAD_REQUEST, "C003", "필수 요청 파라미터가 누락되었습니다."),
    METHOD_NOT_ALLOWED(ErrorLevel.METHOD_NOT_ALLOWED, "C004", "지원하지 않는 HTTP 메소드입니다."),
    ACCESS_DENIED(ErrorLevel.FORBIDDEN, "C005", "접근이 거부되었습니다."),
    INTERNAL_SERVER_ERROR(ErrorLevel.INTERNAL_SERVER_ERROR, "C006", "서버 내부 오류가 발생했습니다."),
    INVALID_STATE(ErrorLevel.BAD_REQUEST, "C007", "지원하지 않는 상태입니다."),
    AUTH_TOKEN_MISSING(ErrorLevel.UNAUTHORIZED, "A001", "인증 토큰이 존재하지 않거나 올바르지 않습니다."),
    AUTH_TOKEN_EXPIRED(ErrorLevel.UNAUTHORIZED, "A002", "만료된 토큰입니다."),
    AUTH_FORBIDDEN_ROLE(ErrorLevel.FORBIDDEN, "A003", "해당 리소스에 접근할 권한이 없습니다."),
    INFRA_DATABASE_ERROR(ErrorLevel.SERVICE_UNAVAILABLE, "I001", "데이터베이스 처리 중 오류가 발생했습니다."),
    INFRA_CACHE_UNAVAILABLE(ErrorLevel.SERVICE_UNAVAILABLE, "I002", "캐시 서버와 통신할 수 없습니다."),
    INFRA_MESSAGE_BROKER_ERROR(ErrorLevel.SERVICE_UNAVAILABLE, "I003", "메시지 브로커 처리 중 오류가 발생했습니다."),
    EXTERNAL_API_ERROR(ErrorLevel.BAD_GATEWAY, "I004", "외부 API 호출 중 오류가 발생했습니다.");

    private final ErrorLevel level;
    private final String code;
    private final String message;
}
