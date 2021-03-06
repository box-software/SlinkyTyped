package typingsSlinky.protractor

import typingsSlinky.protractor.builtConfigMod.Config
import typingsSlinky.protractor.builtDriverProvidersDriverProviderMod.DriverProvider
import typingsSlinky.q.qMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/driverProviders/mock", JSImport.Namespace)
@js.native
object builtDriverProvidersMockMod extends js.Object {
  @js.native
  class Mock () extends DriverProvider {
    def this(config: Config) = this()
    /**
      * An execute function that returns a promise with a test value.
      */
    def execute(): Promise[_] = js.native
  }
  
  @js.native
  class MockExecutor () extends js.Object {
    def execute(command: js.Any): js.Any = js.native
  }
  
}

