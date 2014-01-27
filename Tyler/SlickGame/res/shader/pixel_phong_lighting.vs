// Per-Pixel Vertex Shader

varying vec4 varyingColor;
varying vec3 varyingNormal;
varying vec4 varyingVertex;

void main() {
    varyingColor = gl_Color;
    varyingNormal = gl_Normal;
    varyingVertex = gl_vertex;
    gl_Position = gl_ModelViewProjectionMatrix * gl_Vertex;

}