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
    