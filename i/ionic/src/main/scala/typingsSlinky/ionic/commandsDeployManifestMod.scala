package typingsSlinky.ionic

import typingsSlinky.ionic.commandsDeployCoreMod.DeployCoreCommand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/commands/deploy/manifest", JSImport.Namespace)
@js.native
object commandsDeployManifestMod extends js.Object {
  @js.native
  class DeployManifestCommand () extends DeployCoreCommand {
    var getFileAndSizeAndHashForFile: js.Any = js.native
    var getFilesAndSizesAndHashesForGlobPattern: js.Any = js.native
    var getIntegrity: js.Any = js.native
    var readFile: js.Any = js.native
    def run(): js.Promise[Unit] = js.native
  }
  
}

