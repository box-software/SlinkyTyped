package typingsSlinky.atFirebaseStorage

import typingsSlinky.atFirebaseStorage.distSrcImplementationRequestMod.Request
import typingsSlinky.atFirebaseStorage.distSrcImplementationRequestinfoMod.RequestInfo
import typingsSlinky.atFirebaseStorage.distSrcImplementationXhriopoolMod.XhrIoPool
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/storage/dist/src/implementation/requestmaker", JSImport.Namespace)
@js.native
object distSrcImplementationRequestmakerMod extends js.Object {
  type requestMaker = js.Function3[
    /* requestInfo */ RequestInfo[js.Any], 
    /* authToken */ String | Null, 
    /* pool */ XhrIoPool, 
    Request[js.Any]
  ]
}

