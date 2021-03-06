package typingsSlinky.atPulumiKubernetes

import typingsSlinky.atPulumiKubernetes.atPulumiKubernetesStrings.autoscalingSlashv2beta2
import typingsSlinky.atPulumiKubernetes.typesOutputMod.autoscaling.v2beta2.HorizontalPodAutoscalerSpec
import typingsSlinky.atPulumiKubernetes.typesOutputMod.autoscaling.v2beta2.HorizontalPodAutoscalerStatus
import typingsSlinky.atPulumiKubernetes.typesOutputMod.meta.v1.ObjectMeta
import typingsSlinky.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.outputMod.Output
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/autoscaling/v2beta2/HorizontalPodAutoscaler", JSImport.Namespace)
@js.native
object autoscalingV2beta2HorizontalPodAutoscalerMod extends js.Object {
  @js.native
  class HorizontalPodAutoscaler protected () extends CustomResource {
    /**
      * Create a autoscaling.v2beta2.HorizontalPodAutoscaler resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(
      name: String,
      args: typingsSlinky.atPulumiKubernetes.typesInputMod.autoscaling.v2beta2.HorizontalPodAutoscaler
    ) = this()
    def this(
      name: String,
      args: typingsSlinky.atPulumiKubernetes.typesInputMod.autoscaling.v2beta2.HorizontalPodAutoscaler,
      opts: CustomResourceOptions
    ) = this()
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should
      * convert recognized schemas to the latest internal value, and may reject unrecognized
      * values. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output[autoscalingSlashv2beta2] = js.native
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may
      * infer this from the endpoint the client submits requests to. Cannot be updated. In
      * CamelCase. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output[
        typingsSlinky.atPulumiKubernetes.atPulumiKubernetesStrings.HorizontalPodAutoscaler
      ] = js.native
    /**
      * metadata is the standard object metadata. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    val metadata: Output[ObjectMeta] = js.native
    /**
      * spec is the specification for the behaviour of the autoscaler. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status.
      */
    val spec: Output[HorizontalPodAutoscalerSpec] = js.native
    /**
      * status is the current information about the autoscaler.
      */
    val status: Output[HorizontalPodAutoscalerStatus] = js.native
  }
  
  /* static members */
  @js.native
  object HorizontalPodAutoscaler extends js.Object {
    /**
      * Get the state of an existing `HorizontalPodAutoscaler` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): HorizontalPodAutoscaler = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): HorizontalPodAutoscaler = js.native
    /**
      * Returns true if the given object is an instance of HorizontalPodAutoscaler.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/autoscaling/v2beta2/HorizontalPodAutoscaler.HorizontalPodAutoscaler */ Boolean = js.native
  }
  
}

