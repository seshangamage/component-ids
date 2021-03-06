/*******************************************************************************
 * Copyright  (c) 2015-2016, WSO2.Telco Inc. (http://www.wso2telco.com) All Rights Reserved.
 *
 * WSO2.Telco Inc. licences this file to you under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.wso2telco.proxy.util;

/**
 * This file contains the constants, used in auth-proxy-service webapp.
 */
public class AuthProxyConstants {
    public static final String ACR = "acr_values";
    public static final String ASE_KEY = "AES";
    public static final String CLAIM = "http://wso2.org/claims";
    public static final String MSISDN_ENCRYPTION_KEY = "msisdnEncryptionKey";
    public static final String ENCRYPTION_IMPLEMENTATION = "encryptionImplementation";
    public static final String ID = "ID";
    public static final String IP_ADDRESS = "ipAddress";
    public static final String IP_HEADER = "ipHeader";
    public static final String IS_HEADER_ENCRYPTED = "isHeaderEncrypted";
    public static final String IS_NEW = "isNew";
    public static final String LOA_CLAIM_NAME = "http://wso2.org/claims/loa";
    public static final String LOGIN = "login";
    public static final String LOGIN_HINT = "login_hint";
    public static final String LOGIN_HINT_ENCRYPTED_PREFIX = "ENCR_MSISDN:";
    public static final String LOGIN_HINT_NOENCRYPTED_PREFIX = "MSISDN:";
    public static final String MD5_DIGEST = "MD5";
    public static final String MSISDN_HEADER = "msisdn_header";
    public static final String MSISDN_HEADER_NAME = "msisdnHeaderName";
    public static final String MOBILE_CLAIM_NAME = "http://wso2.org/claims/mobile";
    public static final String OPERATOR = "operator";
    public static final String OPERATOR_ID = "operatorId";
    public static final String OPERATOR_NAME = "operatorName";
    public static final String OPERATOR_CLAIM_NAME = "http://wso2.org/claims/operator";
    public static final String PRIORITY = "priority";
    public static final String PROMPT = "prompt";
    public static final String TELCO_PROMPT = "telco_prompt";
    public static final String PROPERTY_VALUE = "propertyValue";
    public static final String RC4_KEY = "RC4";
    public static final String REDIRECT_URI = "redirect_uri";
    public static final String REQUIRED_IP_VALIDATION = "requiredIPValidation";
    public static final String SCOPE = "scope";
    public static final String SCOPE_CPI = "cpi";
    public static final String SCOPE_MNV = "mnv";
    public static final String SCOPE_OPENID = "openid";
    public static final String TELCO_SCOPE = "telco_scope";
    public static final String PARENT_SCOPE = "parent_scope";
    public static final String API_SCOPES = "api_scope";
    public static final String SCOPE_TYPES = "scope_types";
    public static final String UTF_ENCODER = "UTF-8";
    public static final String SHOW_TNC = "isShowTnc";
    public static final String SHOW_CONSENT = "isShowConsent";
    public static final String LOGIN_HINT_MANDATORY = "isLoginhintMandatory";
    public static final String HEADER_MISMATCH_RESULT = "headerMismatchResult";
    public static final String HE_FAILURE_RESULT = "heFailureResult";
    public static final String LOGIN_HINT_MSISDN = "loginhintMsisdn";
    public static final String CLIENT_ID = "client_id";
    public static final String TRANSACTION_ID = "transactionId";
    public static final String MSISDN_VALIDATION_REGEX =  "validationRegex";
    public static final String RESPONSE_TYPE =  "response_type";
    public static final String ATTR_SHARE_SCOPE = "isAttrScope";
    public static final String TRUSTED_STATUS = "trustedstatus";
    public static final String ATTR_SHARE_SCOPE_TYPE = "attrShareType";
    public static final String STATE =  "state";
    public static final String NONCE =  "nonce";
    public static final String NOTIFICATION_URI =  "notification_uri";
    public static final String ACR_VALUE = "acr_value";
    public static final String CLIENT_NOTIFICATION_TOKEN = "client_notification_token";
    public static final String IS_BACKCHANNEL_ALLOWED = "is_backChannel_allowed";
    public static final String CORRELATION_ID = "correlation_id";
    public static final String REDIRECT_URL = "redirect_uri";
    public static final String CODE = "code";
    public static final String AUTH_REQ_ID = "auth_req_id";
    public static final String ISS = "iss";
    public static final String AUD = "aud";
    public static final String VERSION = "version";
    public static final String SP_REQUEST_ENCRYPTED_PUBLIC_KEY = "bcRequestEncryptedPublicKey";
    public static final String SP_LOGO = "logo";
    public static final String APPROVE_NEEDED_SCOPES = "approve_needed_scopes";
    public static final String APPROVED_SCOPES = "approved_scopes";
    public static final String APPROVE_ALL_ENABLE = "approve_all_enable";
    public static final String IS_API_CONSENT = "is_api_consent";
}