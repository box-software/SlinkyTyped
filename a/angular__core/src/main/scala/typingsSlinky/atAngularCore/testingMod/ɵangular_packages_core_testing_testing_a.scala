package typingsSlinky.atAngularCore.testingMod

import typingsSlinky.atAngularCore.Anon_Deps
import typingsSlinky.atAngularCore.Anon_Providers
import typingsSlinky.atAngularCore.Anon_UseValue
import typingsSlinky.atAngularCore.atAngularCoreMod.Component
import typingsSlinky.atAngularCore.atAngularCoreMod.Directive
import typingsSlinky.atAngularCore.atAngularCoreMod.InjectFlags
import typingsSlinky.atAngularCore.atAngularCoreMod.InjectionToken
import typingsSlinky.atAngularCore.atAngularCoreMod.NgModule
import typingsSlinky.atAngularCore.atAngularCoreMod.Pipe
import typingsSlinky.atAngularCore.atAngularCoreMod.PlatformRef
import typingsSlinky.atAngularCore.atAngularCoreMod.Type
import typingsSlinky.atAngularCore.testingTestingMod.MetadataOverride
import typingsSlinky.atAngularCore.testingTestingMod.TestBedStatic
import typingsSlinky.atAngularCore.testingTestingMod.TestModuleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_a")
@js.native
class ɵangular_packages_core_testing_testing_a ()
  extends typingsSlinky.atAngularCore.testingTestingMod.ɵangular_packages_core_testing_testing_a

/* static members */
@JSImport("@angular/core/testing", "\u0275angular_packages_core_testing_testing_a")
@js.native
object ɵangular_packages_core_testing_testing_a extends js.Object {
  /**
    * Compile components with a `templateUrl` for the test's NgModule.
    * It is necessary to call this function
    * as fetching urls is asynchronous.
    */
  def compileComponents(): js.Promise[_] = js.native
  /**
    * Allows overriding default compiler providers and settings
    * which are defined in test_injector.js
    */
  def configureCompiler(config: Anon_Providers): TestBedStatic = js.native
  /**
    * Allows overriding default providers, directives, pipes, modules of the test injector,
    * which are defined in test_injector.js
    */
  def configureTestingModule(moduleDef: TestModuleMetadata): TestBedStatic = js.native
  def createComponent[T](component: Type[T]): typingsSlinky.atAngularCore.testingTestingMod.ComponentFixture[T] = js.native
  /**
    * @deprecated from v8.0.0 use Type<T> or InjectionToken<T>
    * @suppress {duplicate}
    */
  def get(token: js.Any): js.Any = js.native
  def get(token: js.Any, notFoundValue: js.Any): js.Any = js.native
  def get[T](token: InjectionToken[T]): js.Any = js.native
  def get[T](token: InjectionToken[T], notFoundValue: T): js.Any = js.native
  def get[T](token: InjectionToken[T], notFoundValue: T, flags: InjectFlags): js.Any = js.native
  def get[T](token: Type[T]): js.Any = js.native
  def get[T](token: Type[T], notFoundValue: T): js.Any = js.native
  def get[T](token: Type[T], notFoundValue: T, flags: InjectFlags): js.Any = js.native
  def initTestEnvironment(ngModule: js.Array[Type[_]], platform: PlatformRef): typingsSlinky.atAngularCore.testingTestingMod.ɵangular_packages_core_testing_testing_a = js.native
  def initTestEnvironment(ngModule: js.Array[Type[_]], platform: PlatformRef, aotSummaries: js.Function0[js.Array[_]]): typingsSlinky.atAngularCore.testingTestingMod.ɵangular_packages_core_testing_testing_a = js.native
  /**
    * Initialize the environment for testing with a compiler factory, a PlatformRef, and an
    * angular module. These are common to every test in the suite.
    *
    * This may only be called once, to set up the common providers for the current test
    * suite on the current platform. If you absolutely need to change the providers,
    * first use `resetTestEnvironment`.
    *
    * Test modules and platforms for individual platforms are available from
    * '@angular/<platform_name>/testing'.
    */
  def initTestEnvironment(ngModule: Type[_], platform: PlatformRef): typingsSlinky.atAngularCore.testingTestingMod.ɵangular_packages_core_testing_testing_a = js.native
  def initTestEnvironment(ngModule: Type[_], platform: PlatformRef, aotSummaries: js.Function0[js.Array[_]]): typingsSlinky.atAngularCore.testingTestingMod.ɵangular_packages_core_testing_testing_a = js.native
  def overrideComponent(component: Type[_], `override`: MetadataOverride[Component]): TestBedStatic = js.native
  def overrideDirective(directive: Type[_], `override`: MetadataOverride[Directive]): TestBedStatic = js.native
  def overrideModule(ngModule: Type[_], `override`: MetadataOverride[NgModule]): TestBedStatic = js.native
  def overridePipe(pipe: Type[_], `override`: MetadataOverride[Pipe]): TestBedStatic = js.native
  /**
    * Overwrites all providers for the given token with the given provider definition.
    *
    * Note: This works for JIT and AOTed components as well.
    */
  def overrideProvider(token: js.Any, provider: Anon_Deps): TestBedStatic = js.native
  def overrideProvider(token: js.Any, provider: Anon_UseValue): TestBedStatic = js.native
  def overrideTemplate(component: Type[_], template: String): TestBedStatic = js.native
  /**
    * Overrides the template of the given component, compiling the template
    * in the context of the TestingModule.
    *
    * Note: This works for JIT and AOTed components as well.
    */
  def overrideTemplateUsingTestingModule(component: Type[_], template: String): TestBedStatic = js.native
  /**
    * Reset the providers for the test injector.
    */
  def resetTestEnvironment(): Unit = js.native
  def resetTestingModule(): TestBedStatic = js.native
}

