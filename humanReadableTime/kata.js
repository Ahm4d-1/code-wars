
function humanReadable(seconds) {
    const hours = Math.floor(seconds / 60 / 60);
    const mins = Math.floor(seconds / 60) % 60;
    seconds = seconds % 60;
    return `${hours >= 10 ? hours : '0' + hours}:${mins >= 10 ? mins : '0' + mins}:${seconds >= 10 ? seconds : '0' + seconds}`;
}


console.log(humanReadable(59));