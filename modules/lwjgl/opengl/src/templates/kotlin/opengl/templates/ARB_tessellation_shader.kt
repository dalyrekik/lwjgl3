/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_tessellation_shader = "ARBTessellationShader".nativeClassGL("ARB_tessellation_shader") {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension introduces new tessellation stages and two new shader types to the OpenGL primitive processing pipeline. These pipeline stages operate on
        a new basic primitive type, called a patch. A patch consists of a fixed-size collection of vertices, each with per-vertex attributes, plus a number of
        associated per-patch attributes. Tessellation control shaders transform an input patch specified by the application, computing per-vertex and per-patch
        attributes for a new output patch. A fixed-function tessellation primitive generator subdivides the patch, and tessellation evaluation shaders are used
        to compute the position and attributes of each vertex produced by the tessellator.

        When tessellation is active, it begins by running the optional tessellation control shader. This shader consumes an input patch and produces a new
        fixed-size output patch. The output patch consists of an array of vertices, and a set of per-patch attributes. The per-patch attributes include
        tessellation levels that control how finely the patch will be tessellated. For each patch processed, multiple tessellation control shader invocations
        are performed -- one per output patch vertex. Each tessellation control shader invocation writes all the attributes of its corresponding output patch
        vertex. A tessellation control shader may also read the per-vertex outputs of other tessellation control shader invocations, as well as read and write
        shared per-patch outputs. The tessellation control shader invocations for a single patch effectively run as a group. A built-in {@code barrier()}
        function is provided to allow synchronization points where no shader invocation will continue until all shader invocations have reached the barrier.

        The tessellation primitive generator then decomposes a patch into a new set of primitives using the tessellation levels to determine how finely
        tessellated the output should be. The primitive generator begins with either a triangle or a quad, and splits each outer edge of the primitive into a
        number of segments approximately equal to the corresponding element of the outer tessellation level array. The interior of the primitive is tessellated
        according to elements of the inner tessellation level array. The primitive generator has three modes: "triangles" and "quads" split a triangular or
        quad-shaped patch into a set of triangles that cover the original patch; "isolines" splits a quad-shaped patch into a set of line strips running across
        the patch horizontally. Each vertex generated by the tessellation primitive generator is assigned a (u,v) or (u,v,w) coordinate indicating its relative
        location in the subdivided triangle or quad.

        For each vertex produced by the tessellation primitive generator, the tessellation evaluation shader is run to compute its position and other attributes
        of the vertex, using its (u,v) or (u,v,w) coordinate. When computing final vertex attributes, the tessellation evaluation shader can also read the
        attributes of any of the vertices of the patch written by the tessellation control shader. Tessellation evaluation shader invocations are completely
        independent, although all invocations for a single patch share the same collection of input vertices and per-patch attributes.

        The tessellator operates on vertices after they have been transformed by a vertex shader. The primitives generated by the tessellator are passed further
        down the OpenGL pipeline, where they can be used as inputs to geometry shaders, transform feedback, and the rasterizer.

        The tessellation control and evaluation shaders are both optional. If neither shader type is present, the tessellation stage has no effect. If no
        tessellation control shader is present, the input patch provided by the application is passed directly to the tessellation primitive generator, and a
        set of default tessellation level parameters is used to control primitive generation. In this extension, patches may not be passed beyond the
        tessellation evaluation shader, and an error is generated if an application provides patches and the current program object contains no tessellation
        evaluation shader.

        Requires ${GL32.link} and GLSL 1.50. ${GL40.promoted}
        """

    IntConstant(
        "Accepted by the {@code mode} parameter of Begin and all vertex array functions that implicitly call Begin.",

        "PATCHES"..0xE
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of PatchParameteri, GetBooleanv, GetDoublev, GetFloatv, GetIntegerv, and GetInteger64v.",

        "PATCH_VERTICES"..0x8E72
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of PatchParameterfv, GetBooleanv, GetDoublev, GetFloatv, and GetIntegerv, and GetInteger64v.",

        "PATCH_DEFAULT_INNER_LEVEL"..0x8E73,
        "PATCH_DEFAULT_OUTER_LEVEL"..0x8E74
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetProgramiv.",

        "TESS_CONTROL_OUTPUT_VERTICES"..0x8E75,
        "TESS_GEN_MODE"..0x8E76,
        "TESS_GEN_SPACING"..0x8E77,
        "TESS_GEN_VERTEX_ORDER"..0x8E78,
        "TESS_GEN_POINT_MODE"..0x8E79
    )

    IntConstant(
        "Returned by GetProgramiv when {@code pname} is TESS_GEN_MODE.",

        "ISOLINES"..0x8E7A
    )

    IntConstant(
        "Returned by GetProgramiv when {@code pname} is TESS_GEN_SPACING.",

        "FRACTIONAL_ODD"..0x8E7B,
        "FRACTIONAL_EVEN"..0x8E7C
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetFloatv, GetIntegerv, and GetInteger64v.",

        "MAX_PATCH_VERTICES"..0x8E7D,
        "MAX_TESS_GEN_LEVEL"..0x8E7E,
        "MAX_TESS_CONTROL_UNIFORM_COMPONENTS"..0x8E7F,
        "MAX_TESS_EVALUATION_UNIFORM_COMPONENTS"..0x8E80,
        "MAX_TESS_CONTROL_TEXTURE_IMAGE_UNITS"..0x8E81,
        "MAX_TESS_EVALUATION_TEXTURE_IMAGE_UNITS"..0x8E82,
        "MAX_TESS_CONTROL_OUTPUT_COMPONENTS"..0x8E83,
        "MAX_TESS_PATCH_COMPONENTS"..0x8E84,
        "MAX_TESS_CONTROL_TOTAL_OUTPUT_COMPONENTS"..0x8E85,
        "MAX_TESS_EVALUATION_OUTPUT_COMPONENTS"..0x8E86,
        "MAX_TESS_CONTROL_UNIFORM_BLOCKS"..0x8E89,
        "MAX_TESS_EVALUATION_UNIFORM_BLOCKS"..0x8E8A,
        "MAX_TESS_CONTROL_INPUT_COMPONENTS"..0x886C,
        "MAX_TESS_EVALUATION_INPUT_COMPONENTS"..0x886D,
        "MAX_COMBINED_TESS_CONTROL_UNIFORM_COMPONENTS"..0x8E1E,
        "MAX_COMBINED_TESS_EVALUATION_UNIFORM_COMPONENTS"..0x8E1F
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetActiveUniformBlockiv.",

        "UNIFORM_BLOCK_REFERENCED_BY_TESS_CONTROL_SHADER"..0x84F0,
        "UNIFORM_BLOCK_REFERENCED_BY_TESS_EVALUATION_SHADER"..0x84F1
    )

    IntConstant(
        "Accepted by the {@code type} parameter of CreateShader and returned by the {@code params} parameter of GetShaderiv.",

        "TESS_EVALUATION_SHADER"..0x8E87,
        "TESS_CONTROL_SHADER"..0x8E88
    )

    GL40C reuse "PatchParameteri"
    GL40C reuse "PatchParameterfv"
}