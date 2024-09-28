def call() {
    echo "Removing all Docker images"
    sh "docker rmi \$(docker images -q) || true"
}
