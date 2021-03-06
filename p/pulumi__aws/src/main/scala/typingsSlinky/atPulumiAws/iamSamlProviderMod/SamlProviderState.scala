package typingsSlinky.atPulumiAws.iamSamlProviderMod

import typingsSlinky.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SamlProviderState extends js.Object {
  /**
    * The ARN assigned by AWS for this provider.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the provider to create.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * An XML document generated by an identity provider that supports SAML 2.0.
    */
  val samlMetadataDocument: js.UndefOr[Input[String]] = js.native
  /**
    * The expiration date and time for the SAML provider in RFC1123 format, e.g. `Mon, 02 Jan 2006 15:04:05 MST`.
    */
  val validUntil: js.UndefOr[Input[String]] = js.native
}

object SamlProviderState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    name: Input[String] = null,
    samlMetadataDocument: Input[String] = null,
    validUntil: Input[String] = null
  ): SamlProviderState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (samlMetadataDocument != null) __obj.updateDynamic("samlMetadataDocument")(samlMetadataDocument.asInstanceOf[js.Any])
    if (validUntil != null) __obj.updateDynamic("validUntil")(validUntil.asInstanceOf[js.Any])
    __obj.asInstanceOf[SamlProviderState]
  }
}

