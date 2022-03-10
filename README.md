# Building Docker Images with heroku.yml

Sample application to demonstrate `heroku.yml` usage.

This is an example discussed in  [Multiple Docker images on Heroku](https://medium.com/geekculture/multiple-docker-images-on-heroku-3270ed31f2e5).

### Git init

Initialize your git project (`git init` or using `gh` CLI)

Commit and push your code

```
  git add .
  git commit -m "First commit"
  git push --set-upstream origin main  
```

Verify the Git remote repositories

```
  git remote -v
  
  origin  https://github.com/gcatanese/HerokuYmlSample.git (fetch)
  origin  https://github.com/gcatanese/HerokuYmlSample.git (push)

```

### Create heroku app

Create the application **after** initializing the Git repository (see above)

```
  heroku create herokuymlsample
```
Verify again the remote to confirm heroku remotes are also defined

```
  git remote -v
  
  heroku  https://git.heroku.com/herokuymlsample.git (fetch)
  heroku  https://git.heroku.com/herokuymlsample.git (push)
  origin  https://github.com/gcatanese/HerokuYmlSample.git (fetch)
  origin  https://github.com/gcatanese/HerokuYmlSample.git (push)

```

Override the default application stack with `container`
```
  heroku stack:set container
```

Start the deployment pipeline
```
  git push heroku main
```
