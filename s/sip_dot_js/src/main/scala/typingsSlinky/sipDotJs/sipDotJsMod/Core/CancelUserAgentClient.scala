package typingsSlinky.sipDotJs.sipDotJsMod.Core

import typingsSlinky.sipDotJs.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core.CancelUserAgentClient")
@js.native
class CancelUserAgentClient protected ()
  extends typingsSlinky.sipDotJs.libCoreMod.CancelUserAgentClient {
  def this(
    core: typingsSlinky.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore,
    message: typingsSlinky.sipDotJs.libCoreMessagesMod.OutgoingRequestMessage
  ) = this()
  def this(
    core: typingsSlinky.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore,
    message: typingsSlinky.sipDotJs.libCoreMessagesMod.OutgoingRequestMessage,
    delegate: OutgoingRequestDelegate
  ) = this()
}

