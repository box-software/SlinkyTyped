package typingsSlinky.firefoxDashWebextDashBrowser.browser.webRequest

import typingsSlinky.firefoxDashWebextDashBrowser.Anon_End
import typingsSlinky.firefoxDashWebextDashBrowser.Anon_Sha1
import typingsSlinky.firefoxDashWebextDashBrowser.Anon_Sha256
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the certificate properties of the request if it is a secure request. */
trait CertificateInfo extends js.Object {
  var fingerprint: Anon_Sha1
  var isBuiltInRoot: Boolean
  var issuer: String
  var rawDER: js.UndefOr[js.Array[Double]] = js.undefined
  var serialNumber: String
  var subject: String
  var subjectPublicKeyInfoDigest: Anon_Sha256
  /** Contains start and end timestamps. */
  var validity: Anon_End
}

object CertificateInfo {
  @scala.inline
  def apply(
    fingerprint: Anon_Sha1,
    isBuiltInRoot: Boolean,
    issuer: String,
    serialNumber: String,
    subject: String,
    subjectPublicKeyInfoDigest: Anon_Sha256,
    validity: Anon_End,
    rawDER: js.Array[Double] = null
  ): CertificateInfo = {
    val __obj = js.Dynamic.literal(fingerprint = fingerprint.asInstanceOf[js.Any], isBuiltInRoot = isBuiltInRoot.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], subjectPublicKeyInfoDigest = subjectPublicKeyInfoDigest.asInstanceOf[js.Any], validity = validity.asInstanceOf[js.Any])
    if (rawDER != null) __obj.updateDynamic("rawDER")(rawDER.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateInfo]
  }
}

