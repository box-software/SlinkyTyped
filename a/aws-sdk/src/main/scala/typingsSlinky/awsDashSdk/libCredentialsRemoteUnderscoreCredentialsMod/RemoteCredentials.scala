package typingsSlinky.awsDashSdk.libCredentialsRemoteUnderscoreCredentialsMod

import typingsSlinky.awsDashSdk.libCredentialsMod.Credentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/credentials/remote_credentials", "RemoteCredentials")
@js.native
/**
  * Represents credentials received.
  * @param {object} options - Override the default (1s) timeout period.
  */
class RemoteCredentials () extends Credentials {
  def this(options: RemoteCredentialsOptions) = this()
}

