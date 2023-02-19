let mazeLayout
let robotColor

//Function used to restore the maze before every step
function createMaze(difficulty) {
    if(difficulty === "noob") {
        return [
            ['box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b'],
            ['box_b', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box_b'],
            ['box_b', 'box', 'box', 'box_b', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box_b'],
            ['box_b', 'box', 'box', 'box_b', 'box', 'box', 'box', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b'],
            ['box_b', 'box', 'box', 'box_b', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box_b'],
            ['box_b', 'box_b', 'box_b', 'box_b', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box_b'],
            ['box_b', 'box', 'box', 'box_b', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box_b'],
            ['box_b', 'box', 'box', 'box_b', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box_b'],
            ['box_b', 'box', 'box', 'box_b', 'box', 'box', 'box', 'box_b', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box_b'],
            ['box_b', 'box', 'box', 'box_b', 'box', 'box', 'box', 'box_b', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box_b'],
            ['box_b', 'box', 'box', 'box', 'box', 'box', 'box', 'box_b', 'box', 'box', 'box', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b'],
            ['box_b', 'box', 'box', 'box', 'box', 'box', 'box', 'box_b', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box_b'],
            ['box_b', 'box', 'box', 'box', 'box', 'box', 'box', 'box_b', 'box', 'box', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b'],
            ['box_b', 'box', 'box', 'box', 'box_b', 'box_b', 'box', 'box_b', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box_b'],
            ['box_b', 'box', 'box', 'box', 'box', 'box', 'box', 'box_b', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box'],
            ['box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b']
        ]
    }

    else if(difficulty === "medium") {
        return [
            ['box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b'],
            ['box_b', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box_b'],
            ['box_b', 'box', 'box_b', 'box_b', 'box_b', 'box', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b'],
            ['box_b', 'box', 'box', 'box', 'box_b', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box_b'],
            ['box_b', 'box', 'box', 'box', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b'],
            ['box_b', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box_b', 'box', 'box', 'box', 'box', 'box', 'box', 'box_b'],
            ['box_b', 'box', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b'],
            ['box_b', 'box', 'box', 'box', 'box', 'box', 'box_b', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box_b'],
            ['box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box', 'box_b', 'box_b', 'box_b', 'box_b'],
            ['box_b', 'box', 'box', 'box', 'box_b', 'box', 'box', 'box', 'box', 'box', 'box_b', 'box', 'box', 'box', 'box', 'box_b'],
            ['box_b', 'box', 'box', 'box', 'box_b', 'box', 'box', 'box', 'box', 'box', 'box_b', 'box', 'box', 'box', 'box', 'box_b'],
            ['box_b', 'box', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box', 'box_b'],
            ['box_b', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box_b'],
            ['box_b', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box_b'],
            ['box_b', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box'],
            ['box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b']
        ]
    }

    else if(difficulty === "mazeMaster") {
        return [
            ['box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b'],
            ['box_b', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box_b'],
            ['box_b', 'box', 'box_b', 'box_b', 'box_b', 'box', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b'],
            ['box_b', 'box', 'box', 'box', 'box_b', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box_b'],
            ['box_b', 'box', 'box', 'box', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b'],
            ['box_b', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box_b', 'box', 'box', 'box', 'box', 'box', 'box', 'box_b'],
            ['box_b', 'box', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box', 'box_b', 'box_b', 'box_b', 'box_b', 'box', 'box_b', 'box_b', 'box_b'],
            ['box_b', 'box', 'box', 'box', 'box', 'box', 'box_b', 'box', 'box', 'box', 'box', 'box_b' , 'box' , 'box', 'box', 'box_b'],
            ['box_b', 'box_b', 'box_b', 'box', 'box_b', 'box', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b'],
            ['box_b', 'box', 'box', 'box', 'box_b', 'box', 'box', 'box', 'box', 'box', 'box_b', 'box', 'box', 'box', 'box', 'box_b'],
            ['box_b', 'box', 'box', 'box', 'box_b', 'box', 'box', 'box', 'box', 'box', 'box_b', 'box', 'box', 'box', 'box', 'box_b'],
            ['box_b', 'box', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b'],
            ['box_b', 'box', 'box', 'box', 'box_b', 'box', 'box', 'box_b', 'box', 'box', 'box', 'box_b', 'box', 'box', 'box', 'box_b'],
            ['box_b', 'box', 'box', 'box', 'box_b', 'box', 'box', 'box_b', 'box', 'box_b', 'box', 'box_b', 'box', 'box_b', 'box', 'box_b'],
            ['box_b', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box', 'box_b', 'box', 'box', 'box', 'box_b', 'box', 'box'],
            ['box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b', 'box_b']
        ]
    }

    else throw new Error(`Invalid difficulty: ${difficulty}`);
}

//Function used to render the maze on every step
function renderMaze() {
    const labyrinthContainer = $('#labyrinth-container');
    for (let i = 0; i < mazeLayout.length; i++) {
        const row = mazeLayout[i];
        for (let j = 0; j < row.length; j++) {
            const className = row[j];
            const element = $('<div>', {class: className});
            element.addClass('mazeItem')
            if (className === "robot") {
                element.addClass('robot')
            }
            labyrinthContainer.append(element);
        }
    }
}

//Function used to map the color in a more useful way
function colorMapping(colorList) {
    let  colorMap = []
    for (let key in colorList) {
        let coordinates = key.slice(1,-1).split(',').map(x => parseInt(x))
        let x = coordinates[0], y = coordinates[1], color = colorList[key]
        colorMap.push({x, y, color})
    }

    return colorMap
}

//Two utilities function used to show and hide different section
function hideSection(section) {
    section.css({
        'display': 'none'
    })
}
function showSection(section) {
    section.css({
        'display': 'flex'
    })
}

//Function used to show the current steps number to the user
function addPoint() {
    $('.points').text(parseInt($('.points').text()) + 1);
}

//Function used to set the robot color in order to show the current powerUp (movement strategy)a
function setRobotColor(color) {
    if(color) {
        if(color === 'RED') {
            $('.robot').css({
                'filter' : 'invert(23%) sepia(94%) saturate(3701%) hue-rotate(346deg) brightness(88%) contrast(100%)'
            })
        }

        else if(color === 'GREEN') {
            $('.robot').css({
                'filter' : 'invert(64%) sepia(82%) saturate(2542%) hue-rotate(78deg) brightness(108%) contrast(108%)'
            })
        }

        else if(color === 'YELLOW') {
            $('.robot').css({
                'filter' : 'invert(96%) sepia(67%) saturate(5073%) hue-rotate(7deg) brightness(113%) contrast(94%)'
            })
        }

        else if(color === 'CYAN') {
            $('.robot').css({
                'filter' : 'invert(85%) sepia(80%) saturate(7089%) hue-rotate(90deg) brightness(105%) contrast(112%)'
            })
        }

        else {
            throw new Error('Invalid color name: ${color}')
        }
    }
}

//function used to update the mazeLayout 2D string array
//renderMaze() takes mazeLayout as input and generates a maze
 function updateMaze(robotSteps, i, colorMap, difficulty) {

    $('.mazeItem').remove()

    mazeLayout = createMaze(difficulty)

    colorMap.forEach((colorObj) => {

        if(colorObj.x === robotSteps[i].x && colorObj.y === robotSteps[i].y) {
            robotColor = colorObj.color
        }

        mazeLayout[colorObj.x][colorObj.y] = colorObj.color
    })


    if(i > 1) {
        mazeLayout[robotSteps[i-1].x][robotSteps[i-1].y] = 'robot-step'
        mazeLayout[robotSteps[i-2].x][robotSteps[i-2].y] = 'robot-step-lighter'
    }

    else if(i > 0) {
        mazeLayout[robotSteps[i-1].x][robotSteps[i-1].y] = 'robot-step'
    }

    mazeLayout[robotSteps[i].x][robotSteps[i].y] = 'robot'


    renderMaze()

    setRobotColor(robotColor)

    addPoint()
}

function retraceSteps(steps) {

    $('.mazeItem').remove()

    steps.forEach((step) => {
        mazeLayout[step.x][step.y] = 'robot-step-final'
    })

    renderMaze()
}

//JS the needs HTML elements to be loaded
$(document).ready(() => {

    /*
        SECTION
    */
    const homepage = $("#homepage")
    const ranking = $("#ranking")
    const labyrinth = $("#labyrinth")
    const info = $('#info')

    /*
        BUTTON
    */
    const rankingButton = $(".ranking-button")
    const backButton = $(".back-button")
    const readyButton = $(".ready-button")
    const infoBtn = $('.infoBtn')
    const endGameBtn = $('.end-game-btn')
    const backFromInfoBtn = $('#info button')

    rankingButton.click(() => {
        hideSection(homepage)
        showSection(ranking)
    })

    backButton.click(() => {
        hideSection(ranking)
        showSection(homepage)
    })


    //Send a GET request with firstName, LastName and difficulty as parameters of the request to start the game

    readyButton.click(() => {
        let firstName = $('#firstName').val();
        let lastName = $('#lastName').val();
        let difficulty = $('#difficulty').val();

        //It blocks you from start a game without enter first name and last name
        if (!firstName || !lastName) {
            if (!firstName) {
                $('#firstName').css('border', 'solid 2px red')
            } else if (!lastName) {
                $('#lastName').css('border', 'solid 2px red')
            }

            return;
        }

        //Send a GET request with firstName, LastName and difficulty as parameters of the request to start the game
        let params = {
            firstName: firstName,
            lastName: lastName,
            difficulty: difficulty
        }
        // send request with params
        let url = '/game/play' + '?' + $.param(params)


        //Handle the request with Ajax
        $.ajax({
            type: 'GET',
            url: url,
            success: (gameStats) => {

                hideSection(homepage)
                showSection(labyrinth)

                //Function that updates the maze every 700 ms
                async function playSteps() {
                    for (let i = 0; i < gameStats['steps'].length; i++) {
                        updateMaze(gameStats['steps'], i, colorMapping(gameStats['colorList'][i]), difficulty);
                        await new Promise(resolve => setTimeout(resolve, 1000));
                    }
                }

                //JS promise. After the game is completed an 'End' button appears. It takes you to the main menu
                playSteps().then(() => {
                    endGameBtn.css({
                        'visibility' : 'visible'
                    })

                    retraceSteps(gameStats['steps'])
                })

            },
            error: function (xhr, status, error) {
                console.log(error);
            }
        })

        //The request returns all the steps of the robot and all the locations of colorObjects at each step
        //and save the game to the database
    })

    infoBtn.click(() => {
        hideSection(homepage)
        showSection(info)
    })

    backFromInfoBtn.click(() => {
        hideSection(info)
        showSection(homepage)
    })
})

//JS that can be loaded even before HTML
//Ajax GET request used to get the ranking
$.ajax({
    type: 'GET',
    url: '/player/ranking',
    success: (data) => {
        $.each(data.content, function (index, player) {
            let row = $('<tr>');
            row.append($('<td>').text(index + 1));
            row.append($('<td>').text(player.firstName));
            row.append($('<td>').text(player.lastName));
            row.append($('<td>').text(player.points));
            let date = moment(player.date).format('DD/MM/YYYY - HH:mm');
            row.append($('<td>').text(date));
            $('.ranking tbody').append(row);
        });
    },
    error: function (xhr, status, error) {
        console.log(error);
    }
});


