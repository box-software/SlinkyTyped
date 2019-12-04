package typingsSlinky.three

import org.scalajs.dom.raw.WebGLRenderingContext
import typingsSlinky.three.srcCoreBufferGeometryMod.BufferGeometry
import typingsSlinky.three.srcCoreObject3DMod.Object3D
import typingsSlinky.three.srcMaterialsMaterialMod.Material
import typingsSlinky.three.srcRenderersWebglWebGLProgramMod.WebGLProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/renderers/webgl/WebGLMorphtargets", JSImport.Namespace)
@js.native
object srcRenderersWebglWebGLMorphtargetsMod extends js.Object {
  @js.native
  class WebGLMorphtargets protected () extends js.Object {
    def this(gl: WebGLRenderingContext) = this()
    def update(`object`: Object3D, geometry: BufferGeometry, material: Material, program: WebGLProgram): Unit = js.native
  }
  
}

