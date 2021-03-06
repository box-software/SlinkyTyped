package typingsSlinky.wonderDotJs

import typingsSlinky.wonderDotJs.distEs2015MaterialBasicMaterialMod.BasicMaterial
import typingsSlinky.wonderDotJs.distEs2015RendererCommandQuadCommandMod.QuadCommand
import typingsSlinky.wonderDotJs.distEs2015RendererProgramProgramMod.Program
import typingsSlinky.wonderDotJs.distEs2015RendererShaderLibEngineShaderLibMod.EngineShaderLib
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/shader/lib/basic/BasicMaterialColorShaderLib", JSImport.Namespace)
@js.native
object distEs2015RendererShaderLibBasicBasicMaterialColorShaderLibMod extends js.Object {
  @js.native
  class BasicMaterialColorShaderLib () extends EngineShaderLib {
    def sendShaderVariables(program: Program, cmd: QuadCommand, material: BasicMaterial): Unit = js.native
    def setShaderDefinition(cmd: QuadCommand, material: BasicMaterial): Unit = js.native
  }
  
  /* static members */
  @js.native
  object BasicMaterialColorShaderLib extends js.Object {
    def create(): BasicMaterialColorShaderLib = js.native
  }
  
}

