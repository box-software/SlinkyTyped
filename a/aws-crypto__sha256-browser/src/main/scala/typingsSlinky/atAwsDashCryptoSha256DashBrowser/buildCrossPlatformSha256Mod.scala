package typingsSlinky.atAwsDashCryptoSha256DashBrowser

import typingsSlinky.atAwsDashCryptoSha256DashBrowser.atAwsDashCryptoSha256DashBrowserStrings.ascii
import typingsSlinky.atAwsDashCryptoSha256DashBrowser.atAwsDashCryptoSha256DashBrowserStrings.latin1
import typingsSlinky.atAwsDashCryptoSha256DashBrowser.atAwsDashCryptoSha256DashBrowserStrings.utf8
import typingsSlinky.atAwsDashSdkTypes.buildCryptoMod.Hash
import typingsSlinky.atAwsDashSdkTypes.buildCryptoMod.SourceData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-crypto/sha256-browser/build/crossPlatformSha256", JSImport.Namespace)
@js.native
object buildCrossPlatformSha256Mod extends js.Object {
  @js.native
  class Sha256 () extends Hash {
    def this(secret: SourceData) = this()
    val hash: js.Any = js.native
    @JSName("update")
    def update_ascii(data: SourceData, encoding: ascii): Unit = js.native
    @JSName("update")
    def update_latin1(data: SourceData, encoding: latin1): Unit = js.native
    @JSName("update")
    def update_utf8(data: SourceData, encoding: utf8): Unit = js.native
  }
  
}

