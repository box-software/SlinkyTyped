package typingsSlinky.atFirebaseRemoteDashConfig.atFirebaseRemoteDashConfigMod.atFirebaseAppDashTypesMod

import typingsSlinky.atFirebaseRemoteDashConfigDashTypes.atFirebaseRemoteDashConfigDashTypesMod.RemoteConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseApp extends js.Object {
  def remoteConfig(): RemoteConfig
}

object FirebaseApp {
  @scala.inline
  def apply(remoteConfig: () => RemoteConfig): FirebaseApp = {
    val __obj = js.Dynamic.literal(remoteConfig = js.Any.fromFunction0(remoteConfig))
  
    __obj.asInstanceOf[FirebaseApp]
  }
}

