package typingsSlinky.atIonicCliDashFramework.libMod

import typingsSlinky.atIonicCliDashFramework.definitionsMod.CommandMetadata
import typingsSlinky.atIonicCliDashFramework.definitionsMod.CommandMetadataInput
import typingsSlinky.atIonicCliDashFramework.definitionsMod.CommandMetadataOption
import typingsSlinky.atIonicCliDashFramework.definitionsMod.ICommand
import typingsSlinky.atIonicCliDashFramework.definitionsMod.INamespace
import typingsSlinky.atIonicCliDashFramework.libExecutorMod.BaseExecutorDeps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib", "BaseExecutor")
@js.native
class BaseExecutor[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected ()
  extends typingsSlinky.atIonicCliDashFramework.libExecutorMod.BaseExecutor[C, N, M, I, O] {
  def this(hasNamespaceStdoutStderrColors: BaseExecutorDeps[C, N, M, I, O]) = this()
}

