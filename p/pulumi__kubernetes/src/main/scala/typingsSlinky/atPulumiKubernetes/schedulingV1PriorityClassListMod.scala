package typingsSlinky.atPulumiKubernetes

import typingsSlinky.atPulumiKubernetes.atPulumiKubernetesStrings.schedulingDotk8sDotioSlashv1
import typingsSlinky.atPulumiKubernetes.typesOutputMod.meta.v1.ListMeta
import typingsSlinky.atPulumiKubernetes.typesOutputMod.scheduling.v1.PriorityClass
import typingsSlinky.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.outputMod.Output
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/scheduling/v1/PriorityClassList", JSImport.Namespace)
@js.native
object schedulingV1PriorityClassListMod extends js.Object {
  @js.native
  class PriorityClassList protected () extends CustomResource {
    /**
      * Create a scheduling.v1.PriorityClassList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typingsSlinky.atPulumiKubernetes.typesInputMod.scheduling.v1.PriorityClassList) = this()
    def this(
      name: String,
      args: typingsSlinky.atPulumiKubernetes.typesInputMod.scheduling.v1.PriorityClassList,
      opts: CustomResourceOptions
    ) = this()
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should
      * convert recognized schemas to the latest internal value, and may reject unrecognized
      * values. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output[schedulingDotk8sDotioSlashv1] = js.native
    /**
      * items is the list of PriorityClasses
      */
    val items: Output[js.Array[PriorityClass]] = js.native
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may
      * infer this from the endpoint the client submits requests to. Cannot be updated. In
      * CamelCase. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output[typingsSlinky.atPulumiKubernetes.atPulumiKubernetesStrings.PriorityClassList] = js.native
    /**
      * Standard list metadata More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    val metadata: Output[ListMeta] = js.native
  }
  
  /* static members */
  @js.native
  object PriorityClassList extends js.Object {
    /**
      * Get the state of an existing `PriorityClassList` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): PriorityClassList = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): PriorityClassList = js.native
    /**
      * Returns true if the given object is an instance of PriorityClassList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/scheduling/v1/PriorityClassList.PriorityClassList */ Boolean = js.native
  }
  
}

