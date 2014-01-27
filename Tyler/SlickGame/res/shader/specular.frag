// Per-Pixel Shader

varying vec3 color;

void main() {
    gl_FragColor = vec4(color, 1);
}