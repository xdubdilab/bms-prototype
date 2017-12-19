# Git Branches

> Draft

使用 [Git Flow](http://nvie.com/git-model) 分支管理模型

## 主要分支

### master

master 分支上存放的应该是随时可以在生产环境中部署的代码

### develop

主开发分支

## 辅助分支

辅助分支包括：

- 用于开发新功能的 feature 分支
- 用于辅助版本发布的 release 分支
- 用于修正生产代码中缺陷的 hotfix 分支

### feature-xxx

- 可以从 develop 分支派生
- 必须合并回 develop 分支

在开发新功能的时候使用

### release-xxx

- 可以从 develop 分支派生
- 必须合并回 develop 和 master 分支

用来发布新的版本

在这个分支上准备发布版本所需的各项说明信息（版本号、发布时间、编译时间等）

### hotfix-xxx

- 可以从 master 分支派生
- 必须合并回 master 和 develop 分支

当生产环境中的软件发现了严重到必须立即修复的缺陷的时候，就需要从 master 分支上派生 hotfix 分支来进行紧急修复工作

## 示例

> 熟悉之后可以使用 [Git Flow](https://github.com/nvie/gitflow) 或者 IDE 提供的 Git 相关功能

### 开发新功能

```shell
# 新建 feature 分支
git checkout -b feature-xxx develop

# 修改代码并提交
# ..

# 合并回 develop 分支
git pull origin develop
git checkout develop
git merge --no-ff feature-xxx

# 将合并后的 develop 分支推送到远程仓库
git push origin develop

# 删除本地 feature 分支
git branch -d feature-xxx
```

### 发布稳定版本

```shell
# 新建 release 分支
git checkout -b release-0.0.1 develop

# 清理、执行所有测试、更新文档等
# ..

# 合并回 master 和 develop 分支
git pull
git checkout master
git merge --no-ff release-0.0.1
git checkout develop
git merge --no-ff release-0.0.1
git push

# 删除本地 feature 分支
git branch -d release-0.0.1

# 打上 tag
git tag -a v0.0.1 -m 'description' master
git push --tags
```

## References

- <http://www.ituring.com.cn/article/56870>
- <http://blog.jobbole.com/76867/>
