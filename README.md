This repository contains code which displays "Hello World!".
The commands used to make a repository, in order, are:

 - make a folder with some content and a README file

Then: 
    mkdir pgo-git-start 
    cd <folder>
    git init 
    mkdir <directory> 
    touch README.md src/Main.java 
    git status 
    git add README.md src/Main.java 
    git commit -m "(some message descriptive of changes / contents)" 

After that, connect your local repository to a remote one:
    git remote add origin <repository-URL> 
    git remote -v 
    git push -u origin main

    Note: You might need to change 'main' to 'master'.

