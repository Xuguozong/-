### 1.查看提交日志
> `git log`

     # 一行显示一条提交记录   
     git log --pretty=oneline
     
### 2.退回之前版本

> `git reset`

    # 退回至上一版本
    git reset --hard HEAD^  
    
    ## HEAD表示当前版本，HEAD^表示上一版本，HAED~100表示前100个版本
    
    # 退回某一版本
    git reset --hard [commit id]

### 3.查询历史命令

> `git reflog`

### 4.撤销修改

    # 只修改了文件，没添加到暂存区(git add)
    git checkout -- file
    
    # 修改了文件，添加到了暂存区，还没提交(git commit)
    git reset HEAD file
    
    # 修改了文件，添加到了暂存区，而且已提交，还没推送到远程库
    git reset 版本退回
    
### 5.删除文件

> `git rm`

    # 正常删除
    git rm file 
    git commit -m "blablabla..."
    
    # 误删
    git checkout -- file

### 6.添加远程仓库并推送

    # 添加远程仓库
    git remote add origin git@server-name:path/repo-name.git
    # 推送到分支, -u 参数表示第一次推送的关联
    git push [-u] origin 分支名
       
### 7.分支管理

> `创建与合并分支`

    # 1.查看分支
    # git branch
    
    # 2.创建分支
    git branch 分支名

    # 3.切换分支
    git checkout 分支名
 
    # 4.创建+切换分支
    git checkout -b 分支名

    # 5.合并某分支到当前分支
    git merge 分支名
  
    # 6.删除分支
    git branch -d 分支名

    # 7.强行删除分支
    git branch -D 分支名

> `团队开发分支管理策略`

    1.master仅用来发布新版本
    2.干活都在dev分支上，要发布版本时再合并到master分支上
    3.每个开发人员有自己的分支，时不时合并到dev分支上
    4.合并时使用 --no-ff -m "comment" 参数开启普通模式合并,保存合并历史记录

> `Bug分支`

    1.在dev分支上保存工作进度
    git stash
    
    2.在master上创建一个bug分支用于解决bug,然后删除该bug分支
    git checkout master
    git checkout -b issue-101
    git add ...........
    git commit .......
    git checkout master
    git merge --no-ff -m "merged bug fix 101" issue-101
    git branch -d issue-101

    3.回到dev分支继续开发
    git checkout dev
    # 查看保存的工作信息
    git stash list
    # 还原保存的信息并删除记录
    git stash pop

> `feature分支`

    每添加一个新功能，最好新建一个feature分支，在上面开发，合并，最后删除
