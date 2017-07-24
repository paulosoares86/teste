if [[ `git log -1` =~ "[maven-release-plugin]" ]]; then
    echo "Ignoring release plugin generated version"
else
    echo "Preparing release..."
    mvn -B release:prepare
fi
