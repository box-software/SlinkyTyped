package typingsSlinky.atAwsDashCryptoSha256DashBrowser

import typingsSlinky.atAwsDashSdkTypes.buildCryptoMod.SourceData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-crypto/sha256-browser", JSImport.Namespace)
@js.native
object atAwsDashCryptoSha256DashBrowserMod extends js.Object {
  @js.native
  class Ie11Sha256 ()
    extends typingsSlinky.atAwsDashCryptoSha256DashBrowser.buildIe11Sha256Mod.Sha256 {
    def this(secret: SourceData) = this()
  }
  
  @js.native
  class Sha256 ()
    extends typingsSlinky.atAwsDashCryptoSha256DashBrowser.buildCrossPlatformSha256Mod.Sha256 {
    def this(secret: SourceData) = this()
  }
  
  @js.native
  class WebCryptoSha256 ()
    extends typingsSlinky.atAwsDashCryptoSha256DashBrowser.buildWebCryptoSha256Mod.Sha256 {
    def this(secret: SourceData) = this()
  }
  
}

