Steps:
1> Create a repo - eg: GitHubActionsDemo
2> In the repo, create a folder .github/workflows [this can be achived by clicking on Actions - Setup a WF urself]
3> In the folder, create YAML file with .yml extension
4> Search in google: github actions yaml to print hello world
name: hello-world
'on': push
jobs:
  my-job:
    runs-on: ubuntu-latest
    steps:
      - name: my-step
        run: echo "Hello World!"

5> Use https://onlineyamltools.com/prettify-yaml to make sure yaml syntax is correct
6> Commit and push the changes       
7> Go to repo main page and click on Actions tab
8> 

name: hello-world
'on': push
jobs:
  my-job:
    runs-on: ubuntu-latest
    steps:
      - name: my-step
        run: echo "Hello World!"
