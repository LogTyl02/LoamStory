// Vertex Shader

varying vec3 color;

void main() {
    vec3 vertexPosition = (gl_ModelViewMatrix * gl_Vertex).xyz;


}