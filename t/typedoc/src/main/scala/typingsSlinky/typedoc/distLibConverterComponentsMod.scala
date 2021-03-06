package typingsSlinky.typedoc

import typingsSlinky.std.ClassDecorator
import typingsSlinky.typedoc.distLibConverterContextMod.Context
import typingsSlinky.typedoc.distLibConverterConverterMod.Converter
import typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.Reflection
import typingsSlinky.typedoc.distLibUtilsComponentMod.AbstractComponent
import typingsSlinky.typedoc.distLibUtilsComponentMod.ComponentOptions
import typingsSlinky.typescript.typescriptMod.Node
import typingsSlinky.typescript.typescriptMod.SyntaxKind
import typingsSlinky.typescript.typescriptMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/components", JSImport.Namespace)
@js.native
object distLibConverterComponentsMod extends js.Object {
  @js.native
  abstract class ConverterComponent () extends AbstractComponent[Converter]
  
  @js.native
  abstract class ConverterNodeComponent[T /* <: Node */] () extends AbstractComponent[Converter] {
    var supports: js.Array[SyntaxKind] = js.native
    def convert(context: Context, node: T): js.UndefOr[Reflection] = js.native
  }
  
  @js.native
  abstract class ConverterTypeComponent () extends AbstractComponent[Converter] {
    var priority: Double = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.typedoc.distLibUtilsComponentMod.ComponentHost because Already inherited
  - typings.typedoc.distLibUtilsEventsMod.EventDispatcher because Already inherited
  - typings.typedoc.distLibUtilsComponentMod.AbstractComponent because Already inherited
  - typings.typedoc.distLibConverterComponentsMod.ConverterTypeComponent because Already inherited
  - typings.typedoc.distLibConverterComponentsMod.TypeNodeConverter because var conflicts: _componentOptions, _componentOwner, _events, _listeners, _listeningTo, _savedListenId, application, componentName, internalOn, priority. Inlined supportsNode, supportsNode, convertNode, convertNode */ @js.native
  trait TypeConverter[T /* <: Type */, N /* <: Node */] extends TypeTypeConverter[T] {
    def convertNode(context: Context, node: N): js.UndefOr[typingsSlinky.typedoc.distLibModelsTypesAbstractMod.Type] = js.native
    def convertNode(context: Context, node: N, `type`: T): js.UndefOr[typingsSlinky.typedoc.distLibModelsTypesAbstractMod.Type] = js.native
    def supportsNode(context: Context, node: N): Boolean = js.native
    def supportsNode(context: Context, node: N, `type`: T): Boolean = js.native
  }
  
  @js.native
  trait TypeNodeConverter[T /* <: Type */, N /* <: Node */] extends ConverterTypeComponent {
    def convertNode(context: Context, node: N): js.UndefOr[typingsSlinky.typedoc.distLibModelsTypesAbstractMod.Type] = js.native
    def convertNode(context: Context, node: N, `type`: T): js.UndefOr[typingsSlinky.typedoc.distLibModelsTypesAbstractMod.Type] = js.native
    def supportsNode(context: Context, node: N): Boolean = js.native
    def supportsNode(context: Context, node: N, `type`: T): Boolean = js.native
  }
  
  @js.native
  trait TypeTypeConverter[T /* <: Type */] extends ConverterTypeComponent {
    def convertType(context: Context, `type`: T): js.UndefOr[typingsSlinky.typedoc.distLibModelsTypesAbstractMod.Type] = js.native
    def supportsType(context: Context, `type`: T): Boolean = js.native
  }
  
  def Component(options: ComponentOptions): ClassDecorator = js.native
}

