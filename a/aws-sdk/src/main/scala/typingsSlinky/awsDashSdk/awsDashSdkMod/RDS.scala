package typingsSlinky.awsDashSdk.awsDashSdkMod

import typingsSlinky.awsDashSdk.clientsRdsMod.ClientConfiguration
import typingsSlinky.awsDashSdk.libRdsSignerMod.Signer.SignerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk", "RDS")
@js.native
/**
  * Constructs a service object. This object has one method for each API operation.
  */
class RDS ()
  extends typingsSlinky.awsDashSdk.clientsAllMod.RDS {
  def this(options: ClientConfiguration) = this()
}

@JSImport("aws-sdk", "RDS")
@js.native
object RDS extends js.Object {
  @js.native
  /**
    * A signer object can be used to generate an auth token to a database.
    */
  class Signer ()
    extends typingsSlinky.awsDashSdk.clientsAllMod.RDS.Signer {
    def this(options: SignerOptions) = this()
  }
  
}

