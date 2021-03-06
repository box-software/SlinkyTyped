package typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEasComplianceResults extends js.Object {
  var compliant: Boolean
  var disallowConvenienceLogonResult: EasDisallowConvenienceLogonResult
  var maxInactivityTimeLockResult: EasMaxInactivityTimeLockResult
  var maxPasswordFailedAttemptsResult: EasMaxPasswordFailedAttemptsResult
  var minPasswordComplexCharactersResult: EasMinPasswordComplexCharactersResult
  var minPasswordLengthResult: EasMinPasswordLengthResult
  var passwordExpirationResult: EasPasswordExpirationResult
  var passwordHistoryResult: EasPasswordHistoryResult
  var requireEncryptionResult: EasRequireEncryptionResult
}

object IEasComplianceResults {
  @scala.inline
  def apply(
    compliant: Boolean,
    disallowConvenienceLogonResult: EasDisallowConvenienceLogonResult,
    maxInactivityTimeLockResult: EasMaxInactivityTimeLockResult,
    maxPasswordFailedAttemptsResult: EasMaxPasswordFailedAttemptsResult,
    minPasswordComplexCharactersResult: EasMinPasswordComplexCharactersResult,
    minPasswordLengthResult: EasMinPasswordLengthResult,
    passwordExpirationResult: EasPasswordExpirationResult,
    passwordHistoryResult: EasPasswordHistoryResult,
    requireEncryptionResult: EasRequireEncryptionResult
  ): IEasComplianceResults = {
    val __obj = js.Dynamic.literal(compliant = compliant.asInstanceOf[js.Any], disallowConvenienceLogonResult = disallowConvenienceLogonResult.asInstanceOf[js.Any], maxInactivityTimeLockResult = maxInactivityTimeLockResult.asInstanceOf[js.Any], maxPasswordFailedAttemptsResult = maxPasswordFailedAttemptsResult.asInstanceOf[js.Any], minPasswordComplexCharactersResult = minPasswordComplexCharactersResult.asInstanceOf[js.Any], minPasswordLengthResult = minPasswordLengthResult.asInstanceOf[js.Any], passwordExpirationResult = passwordExpirationResult.asInstanceOf[js.Any], passwordHistoryResult = passwordHistoryResult.asInstanceOf[js.Any], requireEncryptionResult = requireEncryptionResult.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IEasComplianceResults]
  }
}

