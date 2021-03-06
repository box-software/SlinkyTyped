package typingsSlinky.postmark.postmarkMod

import typingsSlinky.postmark.distClientModelsMod.ClientOptions.Configuration
import typingsSlinky.postmark.distClientServerClientMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark", "Client")
@js.native
class Client protected () extends default {
  /**
    * Create a client.
    *
    * @param serverToken - The token for the server that you wish to interact with.
    * @param configOptions - Options to customize the behavior of the this client.
    */
  def this(serverToken: String) = this()
  def this(serverToken: String, configOptions: Configuration) = this()
}

