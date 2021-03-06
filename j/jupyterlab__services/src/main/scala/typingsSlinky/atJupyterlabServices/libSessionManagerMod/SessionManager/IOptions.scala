package typingsSlinky.atJupyterlabServices.libSessionManagerMod.SessionManager

import typingsSlinky.atJupyterlabCoreutils.libPollMod.Poll.Standby
import typingsSlinky.atJupyterlabServices.libServerconnectionMod.ServerConnection.ISettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a SessionManager.
  */
trait IOptions extends js.Object {
  /**
    * The server settings for the manager.
    */
  var serverSettings: js.UndefOr[ISettings] = js.undefined
  /**
    * When the manager stops polling the API. Defaults to `when-hidden`.
    */
  var standby: js.UndefOr[Standby] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(serverSettings: ISettings = null, standby: Standby = null): IOptions = {
    val __obj = js.Dynamic.literal()
    if (serverSettings != null) __obj.updateDynamic("serverSettings")(serverSettings.asInstanceOf[js.Any])
    if (standby != null) __obj.updateDynamic("standby")(standby.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

