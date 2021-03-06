package typingsSlinky.azureDashSb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure-sb/lib/models/resourceresult", JSImport.Namespace)
@js.native
object libModelsResourceresultMod extends js.Object {
  @js.native
  object Azure extends js.Object {
    @js.native
    object ServiceBus extends js.Object {
      @js.native
      object Results extends js.Object {
        @js.native
        trait ResourceResult extends js.Object {
          def parse(resourceName: String, nameProperty: String, xml: js.Object): js.Object | js.Array[js.Object] = js.native
          def serialize(resourceName: String, resource: js.Object, properties: js.Array[String]): String = js.native
          def setName(
            entry: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Dictionary<any> */ js.Any,
            nameProperty: String
          ): Unit = js.native
          def setName(entry: Anon_, nameProperty: String): Unit = js.native
        }
        
      }
      
    }
    
  }
  
}

