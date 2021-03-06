package typingsSlinky.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.KeyManagementServiceClient

import typingsSlinky.atGoogleDashCloudKms.Anon_Purpose
import typingsSlinky.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.CryptoKey
import typingsSlinky.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.Omit
import typingsSlinky.atGoogleDashCloudKms.atGoogleDashCloudKmsStrings.purpose
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateCryptoKeyRequest extends js.Object {
  var cryptoKey: (Partial[Omit[CryptoKey, purpose]]) with Anon_Purpose
  var cryptoKeyId: String
  var parent: String
  var skipInitialVersionCreation: js.UndefOr[Boolean] = js.undefined
}

object CreateCryptoKeyRequest {
  @scala.inline
  def apply(
    cryptoKey: (Partial[Omit[CryptoKey, purpose]]) with Anon_Purpose,
    cryptoKeyId: String,
    parent: String,
    skipInitialVersionCreation: js.UndefOr[Boolean] = js.undefined
  ): CreateCryptoKeyRequest = {
    val __obj = js.Dynamic.literal(cryptoKey = cryptoKey.asInstanceOf[js.Any], cryptoKeyId = cryptoKeyId.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    if (!js.isUndefined(skipInitialVersionCreation)) __obj.updateDynamic("skipInitialVersionCreation")(skipInitialVersionCreation.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCryptoKeyRequest]
  }
}

