
To make a repository, first make a folder with some content and a README file. You can also just do it through Github's UI.

The commands used to make a repository, in order, are:

    - mkdir pgo-git-start 
    - cd <folder>
    - git init 
    - mkdir <directory> 
    - touch README.md src/Main.java 
    - git status 
    - git add README.md src/Main.java 
    - git commit -m "(some message descriptive of changes / contents)" 

After that, connect your local repository to a remote one:

    - git remote add origin <repository-URL> 
    - git remote -v 
    - git push -u origin main

    Note: You might need to change 'main' to 'master'.

