package typingsSlinky.typedoc

import typingsSlinky.typedoc.distLibConverterComponentsMod.TypeTypeConverter
import typingsSlinky.typedoc.distLibConverterContextMod.Context
import typingsSlinky.typedoc.distLibModelsTypesAbstractMod.Type
import typingsSlinky.typescript.typescriptMod.ConditionalType
import typingsSlinky.typescript.typescriptMod.ConditionalTypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/types/conditional", JSImport.Namespace)
@js.native
object distLibConverterTypesConditionalMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.typedoc.distLibUtilsComponentMod.ComponentHost because Already inherited
  - typings.typedoc.distLibUtilsEventsMod.EventDispatcher because Already inherited
  - typings.typedoc.distLibUtilsComponentMod.AbstractComponent because Already inherited
  - typings.typedoc.distLibConverterComponentsMod.ConverterTypeComponent because Already inherited
  - typings.typedoc.distLibConverterComponentsMod.TypeNodeConverter because var conflicts: _componentOptions, _componentOwner, _events, _listeners, _listeningTo, _savedListenId, application, componentName, internalOn, priority. Inlined supportsNode, supportsNode, convertNode, convertNode */ @js.native
  class ConditionalConverter () extends TypeTypeConverter[ConditionalType] {
    def convertNode(context: Context, node: ConditionalTypeNode): js.UndefOr[typingsSlinky.typedoc.distLibModelsTypesMod.ConditionalType] = js.native
    def convertNode(context: Context, node: ConditionalTypeNode, `type`: ConditionalType): js.UndefOr[Type] = js.native
    def supportsNode(context: Context, node: ConditionalTypeNode): Boolean = js.native
    def supportsNode(context: Context, node: ConditionalTypeNode, `type`: ConditionalType): Boolean = js.native
  }
  
}

